/**
 * @author xiaozhu
 * 
 */
class Person {
    private String name;
    private int age;
    public Person(String tempName,int tempAge) {
        name = tempName;
        age = tempAge;
    }
    public void telling() {
        System.out.println("name :"+name+",age "+age);
    }
}

public class setter {
    public static void main(String[] args) {
        Person per = new Person("xiaozhu", 19);
        per.telling();
    }
}