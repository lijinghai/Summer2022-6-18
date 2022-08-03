package priv.ljh.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import priv.ljh.common.utils.PageUtils;
import priv.ljh.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author lijinghai
 * @email lijinghailjh@163.com
 * @date 2022-08-03 10:29:01
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

