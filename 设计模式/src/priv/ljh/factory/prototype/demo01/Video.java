package priv.ljh.factory.prototype.demo01;

import java.util.Date;

/**
 * @Author lijinghai
 * @ClassName: Video
 * @Email: lijinghailjh@163.com
 * @Description: 原型模式
 * @Date: 2022/6/19 10:04
 * @Version: v1.0
 */

public class Video implements Cloneable{

    private String name;
    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public Video() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
