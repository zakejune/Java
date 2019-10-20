/**
 * @author xiaozhu
 * java的类（class）基础编写
 */
class Person {
    String name;
    int age;
    public void tell() {
        System.out.println(" 姓名： "+ name +",age is :"+age);
    }
}

public class clc {
    public static void main(String[] args) {
        Person per = new Person();
        per.name = "xiaozhu";
        per.age = 19;
        per.tell();

    }
}
