package priv.ljh.mall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import priv.ljh.common.utils.PageUtils;
import priv.ljh.common.utils.Query;

import priv.ljh.mall.product.dao.CategoryDao;
import priv.ljh.mall.product.entity.CategoryEntity;
import priv.ljh.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

//    @Autowired
//    CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 查出所有分类
     * 组装成父子的树形结构
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {

        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        // 组装父子结构

        // 1 级参数
        List<CategoryEntity> level1Menus = categoryEntities.stream().filter(categoryEntity ->
            categoryEntity.getParentCid() == 0
        ).map((menu)->{
            menu.setChildren(getChildrens(menu,categoryEntities));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()== null?0: menu1.getSort()) - (menu2.getSort()==null?0: menu2.getSort());
        }).collect(Collectors.toList());

        return level1Menus;
    }

    /**
     * 自定义删除功能
     * @param asList
     */
    @Override
    public void removeMenusById(List<Long> asList) {
        // TODO 1.检查当前删除的菜单，是否被别的地方引用了
        // 批量删除 逻辑删除
        baseMapper.deleteBatchIds(asList);
    }

    // 递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> categoryEntities) {
        List<CategoryEntity> children = categoryEntities.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            // 1. 找到子菜单
            categoryEntity.setChildren(getChildrens(categoryEntity, categoryEntities));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            // 2.菜单的排序
            return (menu1.getSort()== null?0: menu1.getSort()) - (menu2.getSort()==null?0: menu2.getSort());
        }).collect((Collectors.toList()));

        return children;
    }

}