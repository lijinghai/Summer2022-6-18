package priv.ljh.service;

import org.springframework.stereotype.Service;
import priv.ljh.dao.PaymentDao;
import priv.ljh.entities.Payment;

import javax.annotation.Resource;

/**
 * @Author lijinghai
 * @ClassName: PaymentServiceImpl
 * @Email: lijinghailjh@163.com
 * @Description: 实现类
 * @Date: 2022/7/11 19:45
 * @Version: v1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
