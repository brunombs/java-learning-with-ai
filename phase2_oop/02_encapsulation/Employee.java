public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Name: " + this.getName() + " | Salary: $" + this.getSalary());
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 500);
        Employee employee2 = new Employee("Jane", 100);
        Employee employee3 = new Employee("Bob", 150);

        System.out.println("Employee Name: " + employee1.getName() + " | Salary: $" + employee1.getSalary());
        System.out.println("Employee Name: " + employee2.getName() + " | Salary: $" + employee2.getSalary());
        System.out.println("Employee Name: " + employee3.getName() + " | Salary: $" + employee3.getSalary());
        employee3.setName("Orlando");
        employee3.display();

        employee1.setSalary(700);
        System.out.println("Employee Name: " + employee1.getName() + " | New Salary: $" + employee1.getSalary());
        employee2.setName("Enzo");
        System.out.println("Employee New Name: " + employee2.getName() + " | Salary: $" + employee2.getSalary());
    }
}
