package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coupons = scan.nextInt();
        int candies = coupons / 10;
        int gumballs = coupons % 10 / 3;

        System.out.println("Enter number of coupons: ");
        System.out.println("Number of Candies: " + candies);
        System.out.println("Number of Gumballs: " + gumballs);

    }
}
