package vehicle;
import java.util.Random;

public class Car {
    private final String VIN = "VIN-";
    private static int carID = 1000;
    private static String[] colors = {"White", "Red", "Blue", "Green", "Black"};
    private static int minMPG = 10;
    private static int maxMPG = 50;
    private static int minPrice = 25000;
    private static int maxPrice = 65000;
    private String vin;
    private String color;
    private double mpg;
    private double price;


    public Car(){
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(colors.length);
        vin = VIN + carID;
        color = String.valueOf(randomIndex);
        mpg = rnd.nextDouble(minMPG,maxMPG);
        price = rnd.nextDouble(minPrice,maxPrice);
        carID += 1;
    }
    public static String[] getColors(){
        return colors;
    }
    public static int getMinMPG(){
        return minMPG;
    }
    public static int getMaxMPG(){
        return maxMPG;
    }
    public static int getMinPrice(){
        return minPrice;
    }
    public static int getMaxPrice(){
        return maxPrice;
    }
    public String getVIN(){
        return VIN;
    }
    public String getColor(){
        return color;
    }
    public double getMpg(){
        return mpg;
    }
    public double getPrice(){
        return price;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setMpg(double mpg){
        this.mpg = mpg;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void displayInfo(){

    }
}
