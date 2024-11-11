package toolkit;

import vehicle.Car;

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
    public static void findCarWithBestMPG(Car[] cars){
        eventsProcessed++;
        Car biggestMPG = cars[0];
        for(int i = 0; i < cars.length; i++){
            if(cars[i].getMpg() > biggestMPG.getMpg()){
                biggestMPG = cars[i];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("====================================================");
        System.out.println("findCarWithBestMPG");
        System.out.println("====================================================");
        biggestMPG.displayInfo();
    }
    public static void findCarWithWorstMPG(Car[] cars){
        eventsProcessed++;
        Car smallestMPG = cars[0];
        for(int i = 0; i < cars.length; i++){
            if(cars[i].getMpg() < smallestMPG.getMpg()){
                smallestMPG = cars[i];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("====================================================");
        System.out.println("findCarWithWorstMPG");
        System.out.println("====================================================");
        smallestMPG.displayInfo();
    }
    public static double averageOfCarPrices(Car[] cars){
        eventsProcessed++;
        double sumOfPrices = cars[0].getPrice();
        for(int i = 0; i < cars.length; i++){
            sumOfPrices += cars[i].getPrice();
        }
        double average = sumOfPrices/cars.length;
        System.out.println();
        System.out.println();
        System.out.printf("Car Average Price: $%.2f", average);
        return average;
    }
}
