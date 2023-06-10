package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements? ");
        int length = scan.nextInt();
        int[] numbers = new int[length];
        System.out.println(getSum(numbers));
    }
    public static int getSum(int[]numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Numbers: ");
            int input = scan.nextInt();
            sum = sum+input;

        }
        return sum;
    }

}
