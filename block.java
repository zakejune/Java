/**
 * @author xiaozhu
 * 代码块是在程序中用{}扩起来的一段程序。四类：普通代码段，模块代码段，静态代码段和同步代码段
 * 
 */
public class block {
    public static void main(String[] args) {
        if(true) {
            int x = 10;    //if定义的局部变量不对外部变量产生影响
            System.out.println("x ="+x);
        }
        int x =101;
        System.out.print("x ="+x);
    }
}

/**
 * output：
 * x =10
 * x =101
 */