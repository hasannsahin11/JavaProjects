package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number%2==0){
            System.out.println(number + " is even.");
        }else {
            System.out.println(number + " is odd.");
        }
    }
}
