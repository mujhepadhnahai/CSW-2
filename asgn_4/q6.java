import java.util.*;
public class q6 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        ArrayList<Object> objects = new ArrayList<>();
        try {
            while (true) { 
                objects.add(new Object());
                if (System.currentTimeMillis() -startTime > 5000){
                    printMemoryUsage(startTime);
                    startTime = System.currentTimeMillis();
                }
            } 
        }
        catch (OutOfMemoryError e) {
            System.out.println("Memory exceeded");
            printMemoryUsage(startTime);
        }
    }
    public static void printMemoryUsage(long startTime) {
        long totalMemory =Runtime.getRuntime().totalMemory();
        long freeMemory = ( - Runtime.getRuntime().freeMemory()) /
        1024 / 1024;
        System.out.println("Memory used: " + memoryUsed + " MB");
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
        }
}    
