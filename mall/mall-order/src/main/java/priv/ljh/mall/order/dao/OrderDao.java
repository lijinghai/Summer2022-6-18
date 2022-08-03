package priv.ljh.mall.order.dao;

import priv.ljh.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lijinghai
 * @email lijinghailjh@163.com
 * @date 2022-08-03 10:36:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
