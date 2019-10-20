/**
 * @author xiaohzu
 *  趣味三角形打印
 * 
 */

 public class triangle{
     public static void main(String[] args) {
         int i=9;
         for (int x=0;x<i;x++) {
             for (int y=0;y<i-x;y++) {
                 System.out.print(" ");
             }
             for (int y=0;y<=x;y++) {
                 System.out.print("* ");
             }
            System.out.println( );
         }
     }
 }
