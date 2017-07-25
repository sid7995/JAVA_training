/**
 * Created by malviyas on 7/25/2017.
 */
public class Employee {
    private int empId;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int empId, int salary) {
        this.empId = empId;
        this.salary = salary;
    }

}
