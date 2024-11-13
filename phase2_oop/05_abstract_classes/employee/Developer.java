package employee;

public class Developer extends EmployeeAbstract{
    double salary;
    int bonus;

    public Developer(double salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    void calculateSalary() {
        salary = salary + bonus;
        System.out.println("The salary is: " + salary);
    }
}
