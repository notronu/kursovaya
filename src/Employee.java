import java.util.Objects;

public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private final int id;
    private static int idCounter = 1;



    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;

    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(fullName, employee.fullName) && Objects.equals(department, employee.department) && Objects.equals(salary, employee.salary) && Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
