package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your array's length: ");
        int length = scan.nextInt();
        String[] arr = new String[length];
        System.out.println(getWord(arr));
    }

    public static String getWord(String[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your string elements: ");
            arr[i] = scan.nextLine();
            result += "\n" + arr[i].substring(0, 3);
        }
        return result;
    }

}

