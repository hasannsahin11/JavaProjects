package SaturdayProjects.Week7;

import java.util.Arrays;

public class Assignment19 {
    public static void main(String[] args) {
        //first numbers array assigned by 2 elements int array
        // but then assigned 4 elements numbers array. it means numbers [] updated.
        //it is not anymore 2 elements numbers array
        // and assign index 2 and 3 not the other indexes.
        // that's why we will see on the console
        //index[0]=0(if it didn't assign it thus gives default int )
        //index[1]=0(if it didn't assign it gives default int)
        int numbers[];
        numbers=new int[2];
        numbers[0]=10;
        numbers[1]=20;
        numbers=new int[4];
        numbers[2]=30;
        numbers[3]=40;
        System.out.println(Arrays.toString(numbers));
    }
}
