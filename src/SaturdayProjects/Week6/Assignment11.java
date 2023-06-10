package SaturdayProjects.Week6;

import java.sql.Array;
import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter");
        int length = scan.nextInt();
        int[] numbers = new int[length];
        System.out.println(getTotal(numbers));
    }
    public static int getTotal(int[]numbers){
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your elements: ");
            numbers[i] = scan.nextInt();
            result = result+numbers[i]*numbers[i];
            System.out.println(result);
        }
        return result;
    }
}
