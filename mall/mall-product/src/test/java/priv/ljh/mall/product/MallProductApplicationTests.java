package priv.ljh.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import priv.ljh.mall.product.entity.BrandEntity;
import priv.ljh.mall.product.service.BrandService;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    // 插入
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");

//        brandEntity.setName("华为1");
//        brandService.save(brandEntity);
//        System.out.println("success");
//        brandService.updateById(brandEntity);
//        brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id"));
    }



}
