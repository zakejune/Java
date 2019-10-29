/**
 * @author xiaozhu
 * date 2019/10/29
 * static 的妙用 static表示公用，实现一次修改，全部都变
 */
class Chinese {
    private String name;
    private int age;
    static String country = "The people's republic of china ";
    public Chinese(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public String getInfo() {
        return "name : "+this.name +",age : "+this.age+",country :" +this.country;
    }
}

public class stkey {
    public static void main(String[] args) {
        Chinese perQ = new Chinese("xiaozhu", 19);
        Chinese perW = new Chinese("xiaowang", 20);
         perQ.country = "China";
        System.out.println(perQ.getInfo());
        System.out.println(perW.getInfo());
    }
}