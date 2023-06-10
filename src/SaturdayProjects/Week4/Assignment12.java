package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number > 0){
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        }else{
            System.out.println(" ");
        }
    }
}
