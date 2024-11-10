package toolkit;

import java.sql.SQLOutput;
import java.util.Random;

public class ArrayProcessor {
    private static int eventsProcessed = 0;
    public static int getEventsProcessed() {
        return eventsProcessed;
    }
    public static int[] createArrayWithInts(int sizeOfArray, int min, int max){
        eventsProcessed++;
        System.out.println("=================================================");
        System.out.println("displayElementsOfIntArray");
        System.out.println("=================================================");
        Random rndGen = new Random();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            array[i] = rndGen.nextInt(min,max);
        }
        return array;
    }
    public static void displayElementsOfIntArray(int[] array){
        eventsProcessed++;
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i != array.length - 1){
                System.out.print(", ");
            }

        }
    }
    public static double averageOfIntArray(int[] array) {

        eventsProcessed++;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length  ;
        System.out.println("\nArray Average: " + average);
        System.out.println();
        return average;
    }
}
