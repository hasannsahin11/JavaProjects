package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your array's length: ");
        int length = scan.nextInt();
        int[] array = new int[length];
        System.out.println(getMax(array));

    }

    public static int getMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your array's elements");
            array[i] = scan.nextInt();
            if (array[i] > max) {
                max = array[i];


            }
        }
        return max;
    }
}
