package SaturdayProjects.Week6;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something");
        String input = scan.nextLine();
        System.out.println("Enter number");
        int number=scan.nextInt();
        System.out.println(appearsMore(input,number));
    }

    public static boolean appearsMore(String input, int number) {
        int count=0;
        boolean isRepeat=true;
        for (int i = 0; i <input.length()-number ; i++) {
            if(input.substring(0,number).equals(input.substring(i,i+number))){
                count++;
                if(count>=2){
                    isRepeat=true;
                }else{
                    isRepeat=false;
                }
            }

        }
        System.out.println(input.substring(0,number)+" appears "+ count+" times");

        return isRepeat;
    }
}