package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements? ");
        int length = scan.nextInt();
        int[] numbers = new int[length];
        System.out.println(getSingle(numbers));
    }

    public static int getSingle(int[] arr) {
        int single = 0;
        for (int i = 0; i < arr.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Numbers: ");
            arr[i] = scan.nextInt();
        }
        int previous=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=previous && arr[i]!=arr[i+1]){
                single=arr[i];
            }
            previous=arr[i];
        }
        return single;
    }
}
