package priv.ljh.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import priv.ljh.common.utils.PageUtils;
import priv.ljh.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author lijinghai
 * @email lijinghailjh@163.com
 * @date 2022-08-03 09:58:26
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

