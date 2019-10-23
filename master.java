 /**
 *  @author xiaozhu
 * private封装
 */

class Person {
    private String name;
    private int age;

    public void tell(){
        System.out.println("name: "+name);
    }


    public void setName(String tempName){
    name = tempName;
    }

    public void setAge(int tempAge) {
        if(tempAge > 0 && tempAge <200) {
            age = tempAge;
        }
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class master {
    public static void main(String args[]) {
        Person per = new Person();
        per.setName("xiaozhu");
        per.setAge(20);
    }
}
    
