package SaturdayProjects.Week2;

public class Assignment7 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        //num1 = num2
        //num2 + num1
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}
