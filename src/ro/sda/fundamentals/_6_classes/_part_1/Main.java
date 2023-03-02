package ro.sda.fundamentals._6_classes._part_1;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setFirstName("Harry");
        p1.setLastName("Potter");
        p1.setAge(30);

        Person p2 = new Person();
        p2.setFirstName("Leo");
        p2.setLastName("Messi");
        p2.setAge(-100);

        System.out.println(p1.getFirstName() + " " + p1.getLastName() + " " + p1.getAge());
        System.out.println(p2.getFirstName() + " " + p2.getLastName() + " " + p2.getAge());

        System.out.println("--------------------------------------------");

        Person person1 = new Person();
        person1.setFirstName("");   // firstName is set to empty string
        person1.setLastName("");    // lastName is set to empty string
        person1.setAge(10);
        System.out.println("fullName= " + person1.getFullName());
        System.out.println("teen= " + person1.isTeen());

        Person person2 = new Person();
        person2.setFirstName("John");    // firstName is set to John
        person2.setLastName("");    // firstName is set to John
        person2.setAge(18);
        System.out.println("fullName= " + person2.getFullName());
        System.out.println("teen= " + person2.isTeen());

        Person person3 = new Person();
        person3.setFirstName("John");
        person3.setLastName("Smith");    // lastName is set to Smith
        person3.setAge(30);
        System.out.println("fullName= " + person3.getFullName());

        System.out.println("------------------------------");

        Person anotherPerson = new Person("Denisa", "Birisan", 26);
        System.out.println(anotherPerson);

        System.out.println("-------------------------------");
    }
}
