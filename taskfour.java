import java.util.Scanner;

public class taskfour {

    public static void main(String[] args) {
        double inrToUsdRate = 0.014;
        double inrToEurRate = 0.012;
        double inrToJpyRate = 1.54;
        double inrToGbpRate = 0.011;
        double inrToCadRate = 0.018;
        
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the amount in INR: ");
        double amountINR = read.nextDouble();
        
        double amountUSD = amountINR * inrToUsdRate;
        double amountEUR = amountINR * inrToEurRate;
        double amountJPY = amountINR * inrToJpyRate;
        double amountGBP = amountINR * inrToGbpRate;
        double amountCAD = amountINR * inrToCadRate;
        
        System.out.println("Amount in USD: " + amountUSD);
        System.out.println("Amount in EUR: " + amountEUR);
        System.out.println("Amount in JPY: " + amountJPY);
        System.out.println("Amount in GBP: " + amountGBP);
        System.out.println("Amount in CAD: " + amountCAD);
    }
}