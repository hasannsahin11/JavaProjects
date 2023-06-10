package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your array's length");
        int length = scan.nextInt();
        String[] array = new String[length];
        System.out.println(getMerged(array));

    }

    public static String getMerged(String[] arr) {
        String merged = "";
        for (int i = 0; i < arr.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your array's elements");
            arr[i] = scan.nextLine();
        }
        if (arr[0].charAt(arr[0].length() - 1) == arr[1].charAt(0)) {
            merged += arr[0] + arr[1].substring(1);
        } else {
            merged += arr[0] + arr[1];
        }
        return merged;
    }
}