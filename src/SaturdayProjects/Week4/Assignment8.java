package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
