package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        String num = scan.nextLine();
        getDigits(num);
    }

    public static void getDigits(String num) {
        String number = String.valueOf(num);
        for (int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i),10);
            System.out.println("Display promt: " + j);
        }
    }
}

