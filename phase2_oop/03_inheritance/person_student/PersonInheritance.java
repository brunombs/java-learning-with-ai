package person_student;

public class PersonInheritance {
    private String name;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce(){
        System.out.println("Person introduce:");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
    }
}
