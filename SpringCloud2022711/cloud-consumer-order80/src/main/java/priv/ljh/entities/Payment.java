package priv.ljh.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author lijinghai
 * @ClassName: Payment
 * @Email: lijinghailjh@163.com
 * @Description: 实体类
 * @Date: 2022/7/11 19:22
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial;
}
