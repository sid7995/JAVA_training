import org.junit.Test;


public class ArrayHolderTest {


    int[] numbers = new int[]{64, 22, 11, 632, 60, 24, 65, 4, 5, 9};


    ArrayHolder service = new ArrayHolder(numbers);


    @Test
    public void testForEach() {
        service.forEach((num) -> {
            System.out.println(num);
        });
    }

    @Test
    public void testModify() {
        service.modify((num) -> {
            return (int)Math.pow(num,2);
        });
        service.forEach((num) -> {
            System.out.println(num);
        });
    }


    @Test
    public void testDelete() {
        service.delete((num )-> {
            return num < 30;});
        service.forEach((n)-> {
            System.out.println(n);
        });
    }

    @Test
    public void testFold() {
        System.out.println(service.fold((num1, num2) -> {
            return (num1 + num2);
        }));
    }


}
