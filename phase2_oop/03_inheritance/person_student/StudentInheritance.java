package person_student;

public class StudentInheritance extends PersonInheritance{
    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Grade: " + this.grade);
    }
}
