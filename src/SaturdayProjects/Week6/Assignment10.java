package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array length: ");
        int length = scan.nextInt();
        String[] arr = new String[length];
        System.out.println(getWord(arr));

    }

    public static String getWord(String[] arr) {
        String result = "";
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your string elements: ");
            arr[i] = scan.nextLine();
            result += "\n" + arr[i].substring(0,1)+arr[i].charAt(arr[i].length()-1);
        }
        return result;
    }
}