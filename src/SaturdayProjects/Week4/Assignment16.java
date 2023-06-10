package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float priceMeal = 10.0F;
        float priceSoda = 2.0F;

        System.out.println("What would you like?");
        String orderName = scan.nextLine();

        if (orderName.equals("Burger") || orderName.equals("Chicken")){
            System.out.println(priceMeal);
        }
        System.out.println("What would you like to drink?");
        String drinks = scan.nextLine();

        if (drinks.equals("Soda")){
            System.out.println(priceSoda);
        }
    }
}
