package SaturdayProjects.Week3;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to get? ");
        String pName = scan.nextLine();
        System.out.println("What's the price? ");
        double price = scan.nextDouble();
        System.out.println("Quantity? ");
        int quantity = scan.nextInt();
        System.out.println("What's the name for order? ");
        scan.nextLine();
        String name = scan.nextLine();

        System.out.println(name.substring(0,5) + "," + "your order for " + quantity +" "+ pName + " has been placed. Your total is: " + price*quantity);
        }
    }

