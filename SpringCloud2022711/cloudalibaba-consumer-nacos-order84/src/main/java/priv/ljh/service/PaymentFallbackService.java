package priv.ljh.service;

import org.springframework.stereotype.Component;
import priv.ljh.entities.CommonResult;
import priv.ljh.entities.Payment;

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}

