package priv.ljh.service;

import org.springframework.stereotype.Component;

/**
 * @Author lijinghai
 * @ClassName:PaymentFallbackService
 * @Email: lijinghailjh@163.com
 * @Description: PaymentFallbackService类实现PaymentHystrixService接口
 * @Date: 2022/7/19 14:17
 * @Version: v1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }

}
