package SaturdayProjects.Week7;

public class Assignment12 {
    // num1 is an array with 3 digit long
    // num2's size is 5
    // num1=num2 means num1 is exact the same of num2 so it will print 1 2 3 4 5
    public static void main(String[] args) {
        int[] num1 = new int[3];
        int[] num2 = {1, 2, 3, 4, 5};
        num1 = num2;
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
}
