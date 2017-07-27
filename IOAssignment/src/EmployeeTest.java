import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by malviyas on 7/28/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(3, "ADD", 98000));
        emp.add(new Employee(45, "ADGD", 45000));
        emp.add(new Employee(32, "ADSDD", 30000));
        emp.add(new Employee(43, "KJH", 50000));
        emp.add(new Employee(76, "AIID", 207566));
        emp.add(new Employee(9, "VJDFD", 200555));
        emp.add(new Employee(66, "KGJF", 200770));
        emp.add(new Employee(34, "TRT", 200670));
        emp.add(new Employee(55, "LGJHD", 650000));
        emp.add(new Employee(88, "SAFA", 90000));
        emp.add(new Employee(99, "FHD", 12000));
        emp.add(new Employee(37, "FJRY", 56000));
        emp.add(new Employee(4, "HRYYHR", 23000));
        emp.add(new Employee(5, "SFSN", 89000));
        emp.add(new Employee(83, "THTH", 75000));
        emp.add(new Employee(98, "RTERH", 32000));
        emp.add(new Employee(766, "AASA", 10000));
        emp.add(new Employee(56, "AMGG", 220000));
        emp.add(new Employee(97, "DDXNX", 70000));
        emp.add(new Employee(32, "DNDG", 30000));
        emp.add(new Employee(1, "SDGH", 50000));
        List<Employee> emp2 = new ArrayList<>();
        Iterator<Employee> itr = emp.iterator();
        while (itr.hasNext()) {
            Employee e = itr.next();
            if (e.getSalary() >= 40000) {
                emp2.add(e);
            }
        }
        Collections.sort(emp2);
        //emp2.add(null);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\malviyas\\Desktop\\Employee.txt");
            oos = new ObjectOutputStream(fos);
            for (Employee employee : emp2) {
                oos.writeObject(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                    oos.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("C:\\Users\\malviyas\\Desktop\\Employee.txt");
            ois = new ObjectInputStream(fis);
            boolean check = true;
            try {
                Employee emp3 = (Employee) ois.readObject();
                while (check) {
                    if (emp3 != null) {
                        System.out.println(emp3);
                        emp3 = (Employee) ois.readObject();
                    }
                }
            } catch (EOFException e){
               check = false;
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}