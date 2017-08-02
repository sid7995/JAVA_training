/**
 * Created by malviyas on 8/2/2017.
 */

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrimeNumberSum{
    public static void main(String[] args) {
                 ExecutorService executor= Executors.newFixedThreadPool(5);
              List<Future<Integer>> futureList=Arrays.asList(executor.submit(new PrimeNumberGeneratorTask()),
                               executor.submit(new PrimeNumberGeneratorTask2()),
                                executor.submit(new PrimeNumberGeneratorTask3()),
                                executor.submit(new PrimeNumberGeneratorTask4()),
                               executor.submit(new PrimeNumberGeneratorTask5()));
                int sum=0;
                for (int i = 0; i <futureList.size() ; i++) {
                         try {
                                 sum+=futureList.get(i).get();
                             } catch (InterruptedException e) {
                                 e.printStackTrace();
                             } catch (ExecutionException e) {
                                 e.printStackTrace();
                             }


                }
                System.out.println("Sum :" + (sum-1));
            }


        }
