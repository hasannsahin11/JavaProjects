package SaturdayProjects.Week7;

import java.util.Arrays;

public class Assignment23 {
    public static void main(String[] args) {
        //intArr[2]=intArr[4]=75
        //intArr[4]=updated, and it become 90 not 75 anymore.
        //the result will be {15,30,75,60,90}
        int[]intArr={15,30,45,60,75};
        intArr[2]=intArr[4];
        intArr[4]=90;
        System.out.println(Arrays.toString(intArr));
    }
}
