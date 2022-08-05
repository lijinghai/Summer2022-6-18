package priv.ljh.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import priv.ljh.common.utils.PageUtils;
import priv.ljh.mall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author lijinghai
 * @email lijinghailjh@163.com
 * @date 2022-08-03 10:29:01
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

