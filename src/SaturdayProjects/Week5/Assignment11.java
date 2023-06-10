package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number frame that you want numbers can be divided by 3: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(getNumbers(num1,num2));
    }
    public static String getNumbers(int num1, int num2){
        String numbers = "";
        for (int i = num1; i <= num2; i++) {
            if (i%3==0){
                numbers += i + ",";
            }

        }
        return numbers;
    }
}