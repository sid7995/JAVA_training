import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by malviyas on 7/27/2017.
 */
public class IOExample {
    public static void main(String[] args) throws IOException {
        Set<String> cars = new HashSet<>();
        cars.add("BMW ");
        cars.add("AUDI ");
        cars.add("MARUTI ");
        cars.add("HONDA ");
        cars.add("HYUNDAI ");
        cars.add("TATA ");
        cars.add("JAGUAR ");
        cars.add("VOLVO ");
        cars.add("RENAULT ");
        FileWriter file = null;

        Iterator<String> itr = cars.iterator();
        try {
            file = new FileWriter("C:\\Users\\malviyas\\Desktop\\cars.txt");
            while (itr.hasNext()) {
                file.write((String) itr.next());
                file.write("\n");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
            if(file != null)
                file.close();
        }
    }
}



