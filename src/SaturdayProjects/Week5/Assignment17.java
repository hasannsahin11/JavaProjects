package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scan.nextInt();
        System.out.println(getResult(n));


    }

    public static String getResult(int n) {
        int fact = 1;
        String total = "";
        for (int i = n; i > 1; i--) {
            fact = fact * i;
            total += i + "x";
        }
        total = total+"1= "+ fact;
        return total;
    }
}

