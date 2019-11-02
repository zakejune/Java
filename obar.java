/**
 * @author xiaozhu
 * Java数组转置
 */
class obarray {
 public static void reserse(int data[]) {
     int center = data.length / 2;
     int head = 0;
     int tail = data.length - 1;
     for (int a=0;a < center ; a++){
         int temp = data [head];
         data[head] = data[tail];
         data[tail] = temp;
         head++;
         tail--;
     }
 }
 public static void printArray(int temp[]) {
     for (int a = 0;a<temp.length;a++) {
         System.out.println(temp[a]+"  ");
     }
         System.out.println();
 }
}
public class obar {
    public static void main(String[] args) {
        int data[] = new int[] {1,2,3,4,5,6,7,8};
        obarray.reserse(data);
        obarray.printArray(data);
    }
}
