/**
 * @author  xiaozhu
 * 1-90阶乘的和
 */
public class jiecheng {
    public static void main(String[] args) {
        System.out.println(sum(90));
    }
    public static double sum(int num) {
        if (num == 1) {
            return factorial(1);
        }
        return factorial(num)+sum(num-1);
    }

    public static double factorial(int num) {
        if (num ==1) {
            return 1;
        }
        return num*factorial(num-1);
    }
}
