package priv.ljh.service;

import org.apache.ibatis.annotations.Param;
import priv.ljh.entities.Payment;

/**
 * @Author lijinghai
 * @ClassName: PaymentService
 * @Email: lijinghailjh@163.com
 * @Description: 接口
 * @Date: 2022/7/11 19:44
 * @Version: v1.0
 */
public interface PaymentService {
    /**
     * 写
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 读
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
