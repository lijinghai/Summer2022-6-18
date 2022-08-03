package priv.ljh.mall.member.dao;

import priv.ljh.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lijinghai
 * @email lijinghailjh@163.com
 * @date 2022-08-03 10:29:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
