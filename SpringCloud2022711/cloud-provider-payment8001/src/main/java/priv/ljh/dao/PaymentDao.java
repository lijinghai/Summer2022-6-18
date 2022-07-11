package priv.ljh.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import priv.ljh.entities.Payment;

/**
 * @Author lijinghai
 * @ClassName: PaymentDao
 * @Email: lijinghailjh@163.com
 * @Description: 接口
 * @Date: 2022/7/11 19:26
 * @Version: v1.0
 */
@Mapper
public interface PaymentDao {
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
