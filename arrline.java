 /**
 * @author xiaozhu
 * java数组排序
 */
import sun.security.util.ArrayUtil;

class ArryUntil {
    public static void  printArray(int temp[]) {
        for (int x = 0; x < temp.length;x++) {
            System.out.print(temp[x]+",");
        }
        System.out.println();
    }
}

public class arrline {
    public static void main(String[] args) {
        int data[] = new int[] {23,45,342,15,36,23};
        java.util.Arrays.sort(data);
        ArrayUtil.printArray(data);
    }
}