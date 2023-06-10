package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements? ");
        int length = scan.nextInt();
        int[] numbers = new int[length];
        System.out.println(getEvenCount(numbers));
    }

    public static int getEvenCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Numbers: ");
            int input = scan.nextInt();
            if (input % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
