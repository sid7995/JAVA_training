import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by malviyas on 7/25/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1,10000));
        employee.add(new Employee(2,20000));
        employee.add(new Employee(3,30000));
        employee.add(new Employee(4,4000));
        employee.add(new Employee(5,5000));
        employee.add(new Employee(6,60000));
        employee.add(new Employee(7,70000));
        employee.add(new Employee(8,80000));
        employee.add(new Employee(9,90000));
        employee.add(new Employee(10,100000));
        Iterator<Employee> itr = employee.iterator();
        while(itr.hasNext()) {
            Employee val = itr.next();
            if (val.getSalary() < 20000) {
                val.setSalary(val.getSalary()+(.2*val.getSalary()));
                System.out.println(val.getSalary());
            }
            else{
                System.out.println(val.getSalary());
            }
        }


    }
}
