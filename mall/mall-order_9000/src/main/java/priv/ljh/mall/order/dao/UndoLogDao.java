package priv.ljh.mall.order.dao;

import priv.ljh.mall.order.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author lijinghai
 * @email lijinghailjh@163.com
 * @date 2022-08-03 10:36:31
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
