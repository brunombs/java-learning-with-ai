public class Person {
    String name;
    int age;

    public void introduce () {
        System.out.println("Person:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Bruno";
        person.age = 27;
        person.introduce();
    }
}
