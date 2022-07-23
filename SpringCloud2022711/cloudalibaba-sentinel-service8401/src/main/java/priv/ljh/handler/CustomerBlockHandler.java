package priv.ljh.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import priv.ljh.entities.CommonResult;

/**
 * @author lijinghai
 * @date 2022-7-23
 * 客户自定义限流处理逻辑
 * 自定义限流处理类 - 创建CustomerBlockHandler类用于自定义限流处理逻辑
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    
    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
