import java.time.ZonedDateTime;

/**
 * 可以通过下述方法获得上述格式的时间戳字符串
 */
public class T2
{
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

        // 2022-07-20T15:57:13.361+08:00[Asia/Shanghai]

    }
}

