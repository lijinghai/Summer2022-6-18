package priv.ljh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import priv.ljh.entities.CommonResult;
import priv.ljh.entities.Payment;

/**
 * @Author lijinghai
 * @ClassName: PaymentFeignService
 * @Email: lijinghailjh@163.com
 * @Description: 业务逻辑接口+@FeignClient配置调用provider服务  新建PaymentFeignService接口并新增注解@FeignClient
 * @Date: 2022/7/16 18:35
 * @Version: v1.0
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
