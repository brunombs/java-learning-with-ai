public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student bruno = new Student("Bruno", 27);
        Student julia = new Student("Julia", 27);
        Student gabriel = new Student("Gabriel", 25);

        bruno.displayInfo();
        julia.displayInfo();
        gabriel.displayInfo();
    }
}
