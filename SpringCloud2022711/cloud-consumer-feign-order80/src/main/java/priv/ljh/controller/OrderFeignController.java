package priv.ljh.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import priv.ljh.entities.CommonResult;
import priv.ljh.entities.Payment;
import priv.ljh.service.PaymentFeignService;

import javax.annotation.Resource;

/**
 * @Author lijinghai
 * @ClassName: OrderFeignController
 * @Email: lijinghailjh@163.com
 * @Description:
 * @Date: 2022/7/16 18:41
 * @Version: v1.0
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }
}
