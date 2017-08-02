/**
 * Created by malviyas on 8/2/2017.
 */

import java.util.concurrent.Callable;

class PrimeNumberGeneratorTask2 implements Callable<Integer> {

   @Override
   public Integer call () throws Exception {
       int sum1 = 0;
       for (int i = 100; i < 200; i++) {
           int flag = 0;
           for (int j = 2; j <= Math.sqrt(i); j++) {
               if (isDivisibleBy(i, j)) {
                   flag = 1;
                   break;
               }
           }
           if (flag == 0)
               sum1 += i;
       }
       return sum1;
   }


   private static boolean isDivisibleBy(int no, int i) {
       return no % i == 0;
   }
}


