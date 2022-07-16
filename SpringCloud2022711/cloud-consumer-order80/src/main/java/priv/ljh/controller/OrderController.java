package priv.ljh.controller;

import com.netflix.discovery.DiscoveryClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import priv.ljh.entities.CommonResult;
import priv.ljh.entities.Payment;

import javax.annotation.Resource;

/**
 * @Author lijinghai
 * @ClassName: OrderController
 * @Email: lijinghailjh@163.com
 * @Description: 客户端控制类
 * @Date: 2022/7/12 15:36
 * @Version: v1.0
 */
@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    /**
     * @Resource注入实例化
     */
    @Resource
    private RestTemplate restTemplate;

//    @Resource
//    private LoadBalanced loadBalanced;
//
//    @Resource
//    private DiscoveryClient discoveryClient;

    /**
     * 新增
     * @param payment
     * @return
     */
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create",payment,CommonResult.class);
    }

    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/"+id,CommonResult.class);
    }

    @GetMapping("/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id") Long id) {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();//getForObject()
        }else{
            return new CommonResult<>(444,"操作失败");
        }

    }

}
