/**
 * @author xiaozhu
 * date 2019/10/31
 * java的二维数组
 */public class arraymode {
     public static void main(String[] args) {
         int data [][] = new int[][] {
             {1,2,12,14,41},{21,32,41}
         };
         for (int temp[] : data) {
             for(int num : temp) {
                 System.out.println(num+";");
             }
             System.out.println( );
         }
     }
 }