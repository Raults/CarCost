import java.util.*;
/**
 * Write a description of class Learning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Learning
{
    public static void main(String args[]) {
    int gas = 4;
    int miles = 50000;
    int carAmpg = 10;
    int carAcost = 15000;
    int carBmpg = 50;
    int carBcost = 30000;
    int totalGasA = (miles/carAmpg)*gas;
    int totalGasB = (miles/carBmpg)*gas;
    int totalCostA = totalGasA + carAcost;
    int totalCostB = totalGasB + carBcost;
    
    if (totalCostA < totalCostB){
        System.out.println("Buy car A for $" + totalCostA);
    } else {
        System.out.println("Buy car B for $" + totalCostB);
    }
}
}