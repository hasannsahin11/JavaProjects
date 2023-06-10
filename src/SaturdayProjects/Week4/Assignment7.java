package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if (num>0) {
            System.out.println(num + " is positive.");
        } else if (num<0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println("It is Zero.");
        }
    }
}