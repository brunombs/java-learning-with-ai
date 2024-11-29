import java.util.ArrayList;

public class StudentList {
    static class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void printDetails() {
            System.out.println("Name: " + name + ", age: " + age);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Bruno", 27));
        students.add(new Student("John", 24));
        students.add(new Student("Jane", 31));

        for (Student student : students) {
            student.printDetails();
        }

        students.remove(students.get(1));
        System.out.println("Students in the list: " + students.size());

        for (Student student : students) {
            student.printDetails();
        }
    }
}


