package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements? ");
        int length = scan.nextInt();
        int[] numbers = new int[length];
        printArray(getReversed(numbers));
    }

    public static int[] getReversed(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your array's elements");
            arr[i]= scan.nextInt();
            reversedArray[reversedArray.length - 1 - i] = arr[i];

        }
        return reversedArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}



