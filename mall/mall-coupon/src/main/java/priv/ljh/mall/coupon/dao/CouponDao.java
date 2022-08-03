package priv.ljh.mall.coupon.dao;

import priv.ljh.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lijinghai
 * @email lijinghailjh@163.com
 * @date 2022-08-03 10:23:21
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
