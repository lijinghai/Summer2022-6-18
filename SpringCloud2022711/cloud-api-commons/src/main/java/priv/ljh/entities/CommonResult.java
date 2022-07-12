package priv.ljh.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author lijinghai
 * @ClassName: CommonResult
 * @Email: lijinghailjh@163.com
 * @Description: json格式化
 * @Date: 2022/7/11 19:24
 * @Version: v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T       data;

    public CommonResult(Integer code,String message) {
        this(code,message,null);
    }
}
