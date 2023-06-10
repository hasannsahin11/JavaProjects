package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int balance = 100;
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like?");
        String item = scan.nextLine();

        int smartPhone = 330;
        int laptop = 400;
        int charger = 15;
        int usbCable = 10;
        int headPhones = 30;
        int pants = 50;
        int hat = 25;
        int socks = 5;
        int blanket = 60;
        int pillow = 40;

        if (item.equals("smartPhone") || item.equals("laptop")){
            System.out.println("Sorry, not enough funds on your gift card. ");
        } else if(item.equalsIgnoreCase("charger")){
            balance-=charger;
            System.out.println("Your current balance is : " + balance + " after your charger purchase.");
        } else if (item.equalsIgnoreCase("usbCable")){
            balance-=usbCable;
            System.out.println("Your current balance is : " + balance + " after your usbCable purchase.");
        } else if (item.equalsIgnoreCase("headPhones")){
            balance-=headPhones;
            System.out.println("Your current balance is : " + balance + " after your headPhone purchase.");
        } else if (item.equalsIgnoreCase("pants")){
            balance-=pants;
            System.out.println("Your current balance is : " + balance + " after your Pant purchase.");
        } else if (item.equalsIgnoreCase("hat")){
            balance-=hat;
            System.out.println("Your current balance is : " + balance + " after your hat purchase.");
        } else if (item.equalsIgnoreCase("socks")) {
            balance-=socks;
            System.out.println("Your current balance is : " + balance + " after your socks purchase.");
        } else if (item.equalsIgnoreCase("blanket")){
            balance-=blanket;
            System.out.println("Your current balance is : " + balance + " after your blanket purchase.");
        }else if (item.equalsIgnoreCase("pillow")){
            balance-=pillow;
            System.out.println("Your current balance is : " + balance + " after your pillow purchase.");
        } else {
            System.out.println("Invalid item!");
        }
        System.out.println();
    }
}