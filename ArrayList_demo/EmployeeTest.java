import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by malviyas on 7/25/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1,10000));
        employee.add(new Employee(2,20000));
        employee.add(new Employee(3,30000));
        employee.add(new Employee(4,40000));
        employee.add(new Employee(5,50000));
        employee.add(new Employee(6,60000));
        employee.add(new Employee(7,70000));
        employee.add(new Employee(8,80000));
        employee.add(new Employee(9,90000));
        employee.add(new Employee(10,100000));
        Iterator<Employee> itr = employee.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getSalary()*(.3));
        }



    }
}
