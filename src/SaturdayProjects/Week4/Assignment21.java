package SaturdayProjects.Week4;

import java.util.Scanner;

public class Assignment21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String storageType;
        String screenType;
        String cpu;

        double price = 0;
        double screenSize = 0;

        int ram = 0;
        int memory = 0;

        System.out.println("Select screen size:");
        screenSize = scan.nextDouble();

        if (screenSize == 13.3) {
            price += 200;
        } else if (screenSize == 15.0) {
            price += 300;
        } else if (screenSize == 17.3) {
            price += 400;
        }
        System.out.println("Select cpu: ");
        cpu = scan.next();
        if (cpu.equals("i3")){
            price+=150;
        }else if (cpu.equals("i5")){
            price += 250;
        } else if (cpu.equals("i7")) {
            price +=350;
        }
        System.out.println("Select RAM size: ");
        ram = scan.nextInt();
        price += ram/4*50;

        System.out.println("Enter memory size: ");
        memory = scan.nextInt();

        System.out.println("Enter storage type: ");
        storageType = scan.next();

        if (storageType.equals("SSD")){
            price += (memory / 500)*100;
        } else if (storageType.equals("HDD")) {
            price += (memory/500) * 50;
        }
        System.out.println("Enter screen resolution: ");
        screenType = scan.next();
        if (screenType.equals("FULLHD")){
            price+=100;
        }else if (screenType.equals("4K")){
            price +=200;
        }
        System.out.println("Your laptop price is: $" + price);
    }

}