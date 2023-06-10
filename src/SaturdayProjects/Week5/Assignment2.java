package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(getLarger(num1, num2));
    }
    public static int getLarger(int num1, int num2){
        int result = (num1>num2)? num1:num2;
        return result;
    }
}