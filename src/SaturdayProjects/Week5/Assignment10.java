package SaturdayProjects.Week5;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter start point");
        String startP = scan.nextLine();
        System.out.println("enter end point");
        String endP = scan.nextLine();
        System.out.println(getRoute(startP, endP));
    }

    public static String getRoute(String startP, String endP) {
        String route = "";
        switch (startP) {
            case "A":
                if (endP.equals("B")) {
                    route = route + "right: " + endP + " found";
                } else if (endP.equals("C")) {
                    route = route + " right>down: " + endP + " found";
                } else if (endP.equals("D")) {
                    route = route + " right>down>left: " + endP + " found";
                } else {
                    route = route + startP + " found";
                }
                break;
            case "B":
                if (endP.equals("C")) {
                    route = route + "down: " + endP + " found";
                } else if (endP.equals("D")) {
                    route = route + "down>left: " + endP + " found";
                } else if (endP.equals("A")) {
                    route = route + "down>left>up: " + endP + " found";
                } else {
                    route = route + startP + " found";
                }
                break;
            case "C":
                if (endP.equals("D")) {
                    route = route + "left: " + endP + " found";
                } else if (endP.equals("A")) {
                    route = route + " left>up: " + endP + " found";
                } else if (endP.equals("B")) {
                    route = route + "left>up>right: " + endP + " found";
                } else {
                    route = route + startP + " found";
                }
                break;
            case "D":
                if (endP.equals("A")) {
                    route = route + "up: " + endP + " found";
                } else if (endP.equals("B")) {
                    route = route + " up>right: " + endP + " found";
                } else if (endP.equals("C")) {
                    route = route + " up>right>down: " + endP + " found";
                } else {
                    route = route + startP + " found";
                }
        }
        return route;
    }
}

