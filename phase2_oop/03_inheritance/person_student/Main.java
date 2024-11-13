package person_student;

public class Main {
    public static void main(String[] args) {
        StudentInheritance student = new StudentInheritance();
        PersonInheritance person = new PersonInheritance();

        student.setName("John");
        student.setAge(17);
        student.setGrade(9);
        student.displayStudentInfo();

        person.setName("Jane");
        person.setAge(22);
        person.introduce();
    }
}
