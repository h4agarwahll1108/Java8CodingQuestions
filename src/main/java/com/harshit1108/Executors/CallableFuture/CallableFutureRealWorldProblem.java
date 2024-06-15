package com.harshit1108.Executors.CallableFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

//Implement a program that uses the ExecutorService to invoke multiple Callable tasks
// and obtain their results as a list of Future objects.
//I below code future will get print first than after we get output
public class CallableFutureRealWorldProblem {
    public static void main(String[] args) {
        List<String> symbols = List.of("ABC", "PQR", "TFGF", "YEDS", "PFS");
        List<Future> futures = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        for (String symbol : symbols) {
            Callable<Double> stockSymbolTask = new StockPriceFetcher(symbol);
            System.out.println("submitting for "+symbol);
            Future<Double> future = executorService.submit(stockSymbolTask);
            System.out.println("Future = "+future);
            futures.add(future);
        }
        executorService.shutdown();

        for(int i = 0 ;i<5;i++){
            try {
//                while(!futures.get(i).isDone()) {
//                    Thread.sleep(1000);
//                    System.out.println("Waiting ");
//                }
                System.out.println("Stock from " + symbols.get(i) + " price = " + futures.get(i).get() + " future status " + futures.get(i));

            } catch(InterruptedException | ExecutionException e){
                System.out.println(e);
            }
        }
    }
}

    class StockPriceFetcher implements Callable<Double>{
        private String stockSymbol;
        public StockPriceFetcher(String stockSymbol) {
            this.stockSymbol = stockSymbol;
        }

        @Override
        public Double call() throws Exception {
            Thread.sleep(5000);
            return Math.random() * 100;
        }

}
/*OUTPUT
submitting for ABC
Future = java.util.concurrent.FutureTask@378bf509[Not completed, task = Executors.CallableFuture.StockPriceFetcher@568db2f2]
submitting for PQR
Future = java.util.concurrent.FutureTask@2d98a335[Not completed, task = Executors.CallableFuture.StockPriceFetcher@5fd0d5ae]
submitting for TFGF
Future = java.util.concurrent.FutureTask@7ef20235[Not completed, task = Executors.CallableFuture.StockPriceFetcher@16b98e56]
submitting for YEDS
Future = java.util.concurrent.FutureTask@4f3f5b24[Not completed, task = Executors.CallableFuture.StockPriceFetcher@27d6c5e0]
submitting for PFS
Future = java.util.concurrent.FutureTask@7b23ec81[Not completed, task = Executors.CallableFuture.StockPriceFetcher@15aeb7ab]
Stock from ABC price = 29.678653363501194 future status java.util.concurrent.FutureTask@378bf509[Completed normally]
Stock from PQR price = 23.82683366039615 future status java.util.concurrent.FutureTask@2d98a335[Completed normally]
Stock from TFGF price = 95.4361731856346 future status java.util.concurrent.FutureTask@7ef20235[Completed normally]
Stock from YEDS price = 84.27686290560992 future status java.util.concurrent.FutureTask@4f3f5b24[Completed normally]
Stock from PFS price = 53.431870177261864 future status java.util.concurrent.FutureTask@7b23ec81[Completed normally]
*/
