package priv.ljh.mall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import priv.ljh.common.utils.R;

/**
 * @Author lijinghai
 * @ClassName:CouponFeignService
 * @Email: lijinghailjh@163.com
 * @Description: 优惠券远程调用
 * @Date: 2022/8/3 16:11
 * @Version: v1.0
 */
@Component
@FeignClient(value = "mall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
