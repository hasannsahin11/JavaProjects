package SaturdayProjects.Week2;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in celcius: ");
        double tempC;
        tempC = scan.nextDouble();
        double convertedToF;
        convertedToF = (9*tempC)/5+32;
        System.out.print("The converted Fahrenheit degree is: ");
        System.out.println(convertedToF);




    }
}
