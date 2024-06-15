package com.harshit1108.Threads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentFileReaderWithThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        String[] filePaths = {
                "src/files/sampleFile1.txt",
                "src/files/sampleFile2.txt",
        };

        for(String filePath : filePaths){
            executorService.execute(() -> readFile(filePath));
        }

        executorService.shutdown();

    }

    private static void readFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                Thread.sleep(4000);
                System.out.println("file path =" + filePath + " " + Thread.currentThread().getName() + ": reads line " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

/*OUTPUT
file path =src/files/sampleFile1.txt pool-1-thread-1: reads line File 1 Line 1
file path =src/files/sampleFile2.txt pool-1-thread-2: reads line File 2 Line 1
file path =src/files/sampleFile1.txt pool-1-thread-1: reads line File 1 Line 2
file path =src/files/sampleFile2.txt pool-1-thread-2: reads line File 2 Line 2
file path =src/files/sampleFile2.txt pool-1-thread-2: reads line File 2 Line 3
file path =src/files/sampleFile1.txt pool-1-thread-1: reads line File 1 Line 3
*/


