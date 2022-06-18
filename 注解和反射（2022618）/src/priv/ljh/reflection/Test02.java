package priv.ljh.reflection;

/**
 * @Author lijinghai
 * @ClassName:Test02
 * @Email: lijinghailjh@163.com
 * @Description: 反射
 * @Date: 2022/6/18 15:13
 * @Version: v1.0
 */

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 通过反射获取类的class对象
         */
        Class aClass = Class.forName("priv.ljh.reflection.User");
        System.out.println(aClass);

    }
}

class User {
    private String name;
    private int id;
    private int age;

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
