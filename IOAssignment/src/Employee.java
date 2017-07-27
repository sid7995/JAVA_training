import java.io.Serializable;

/**
 * Created by malviyas on 7/28/2017.
 */
public class Employee implements Comparable,Serializable{
    private int empId;
    private String name;
    transient private long salary;

    public Employee(int empId, String name, long salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee)o;
        return (this.getEmpId()-e.getEmpId());
    }
}
