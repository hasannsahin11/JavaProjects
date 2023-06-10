package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of Inhabitants: ");
        int inhabitant = scan.nextInt();

        System.out.println(getInhabitants(inhabitant));


    }

    public static String getInhabitants(int inhabitant) {
        int day = 0;
        String result = "";
        do {
            result += "\nDay " + day + " :[" + inhabitant + "]";
            inhabitant = inhabitant / 2;
            day++;

        } while (inhabitant != 0);
        return result;

    }
}
