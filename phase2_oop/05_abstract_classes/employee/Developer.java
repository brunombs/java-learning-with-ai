package employee;

public class Developer extends EmployeeAbstract{
    double salary = 500;
    int bonus = 10;
    @Override
    void calculateSalary() {
        salary = salary + bonus;
        System.out.println("The salary is: " + salary);
    }
}
