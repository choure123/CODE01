
class pen {
    String color;
    String type;//ballpoint ;gel

    public void write() {
        System.out.println("writing something");
    }
}

public class OOPsdemo {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();
    }
}
//02
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

 class ENCAPSULATION{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("MANOJ");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
   }
}
//03