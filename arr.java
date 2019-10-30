/**
 * @author xiaozhu
 * date 2019/10/30
 * 尽量每天都写
 * java数组
 */
public class arr {
    public static void main(String[] args) {
        int data [] =new int [3]; //动态初始化  
        data [0] = 1;
        data [1] = 3;
        int dic[] = new int[] {12,35,65};
        int tp[] = dic;
        tp[2] = 17;
        System.out.println("dic[3] is");
        for ( int a=0;a<dic.length;a++) {
            System.out.println(dic[a]  );
        }

        System.out.println("#########");
        System.out.println("data[3] is ");
        for ( int a=0;a<data.length;a++) {
            System.out.println(data[a]  );
        }
        System.out.println("#########");
        System.out.println("tp[3] is ");
        for ( int a=0;a<tp.length;a++) {
            System.out.println(tp[a]  );
        }
        
    }
}