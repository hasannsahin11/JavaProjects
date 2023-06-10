package SaturdayProjects.Week7;

public class Assignment14 {
    public static void main(String[] args) {
        //x=100, and (a) is increment after execution that's why a=100
        // but when we look at b we put 101, and we will increment before execution and b=102
        //so c is 102 we cannot change it because increment after execution.
        //when we go to d b>a and c>a corrects the answer is a. then (b<c)? is wrong. so the answer is a that is 100.
        int x = 100;
        int a = x++;//100
        int b = ++x;//102
        int c = x++;//102
        int d = (a < b) && (a < c) ? a : (b < c) ? b : c;
        System.out.println(d);
    }
}