package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the words: ");
        String word = scan.nextLine();
        System.out.println(isCountEqual(word));
    }

    public static boolean isCountEqual(String word) {
        int countOfCats = 0;
        int countOfDogs= 0;
        boolean isEqual;
        for (int i = 0; i < word.length()-2; i++) {
            if (word.substring(i,i+3).equals("cat")) {
                countOfCats++;

            } else if (word.substring(i,i+3).equals("dog")){
                countOfDogs++;
            }

        }
        if (countOfCats == countOfDogs){
            isEqual = true;
        } else {
            isEqual = false;
        }
        return isEqual;
    }

}
