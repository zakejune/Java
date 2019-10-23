/**
 * @author xiaozhu  
 * java的this用法
 */
class Man {
    private String name;
    private int age;
    public Man(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void jg(){
        if(this.age>18) {
            System.out.println(name + " is a adult");
        }
        else {
            System.out.println(name+" is a child");
        }
    }
}

public class ts {
    public static void main(String[] args) {
        Man p1 = new Man("xiaozhu", 28);
        Man p2 = new Man("xiaoli", 15);
        p1.jg();
        p2.jg();
    }
}