//=================================================================================================
// PROGRAMMER: Gabriel Lozano
// PANTHER ID: 6338626
//
// CLASS: COP2210
// SECTION: UO2
// SEMESTER: Fall 2024
// CLASSTIME: 9:30 AM - 12:15 PM
//
// Project: Lab 8
// DUE: 11/10/24
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
//                                          own and that none of it is the work of any other person.
//===================================================================================================
package app;

import toolkit.ArrayProcessor;
import vehicle.Car;


public class Controller {
    public static void main(String[] args){
        yourInfoHeader();
        for(int i = 0; i < 5; i++){
            int[] array1 = ArrayProcessor.createArrayWithInts(10,-100,1000);
            ArrayProcessor.displayElementsOfIntArray(array1);
            ArrayProcessor.averageOfIntArray(array1);
        }

        Car[] cars = new Car[15];
        for(int i = 0; i < cars.length; i++){
            cars[i] = new Car();
            cars[i].displayInfo();
        }

        ArrayProcessor.findCarWithBestMPG(cars);
        ArrayProcessor.findCarWithWorstMPG(cars);
        ArrayProcessor.averageOfCarPrices(cars);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=========================================================");
        System.out.println("2d Arrays");
        System.out.println("=========================================================");
        int[][] arrayWithinArrayOfInts = {
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4}
        };

        for(int i = 0; i < arrayWithinArrayOfInts.length; i++){
            double sum = 0;
            int[] subArray = arrayWithinArrayOfInts[i];

            for(int k = 0; k < subArray.length; k++){
                sum += subArray[k];
            }
            double average = sum/subArray.length;

            System.out.println();
            System.out.print("{ ");
            for(int k = 0; k < subArray.length; k++){
                System.out.print(subArray[k]);
                if(k != subArray.length - 1){
                    System.out.print(", ");
                }
            }
            System.out.print(" }");

            System.out.printf(" Average of Array Entry: %.1f\n", average);
        }
        System.out.println();
        System.out.println("========================================================");
        System.out.println("ArrayProcessor Events");
        System.out.println("========================================================");
        System.out.println("ArrayProcessor Events:" + ArrayProcessor.getEventsProcessed());
    }
    public static void yourInfoHeader(){
        System.out.println("========================================");
        System.out.println("PROGRAMMER: " + "Gabriel Lozano");
        System.out.println("PANTHER ID: " + "6338626");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210 ");
        System.out.println("SECTION: \t " + "UO2");
        System.out.println("SEMESTER: \t " + "Fall");
        System.out.println("CLASSTIME: \t " + "9:30 AM - 12:30 PM");
        System.out.println();
        System.out.println("Assignment: " + "Lab 8");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU'S academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("=========================================");
        System.out.println();
    }
}
