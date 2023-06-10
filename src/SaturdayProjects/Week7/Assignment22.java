package SaturdayProjects.Week7;

import java.util.Arrays;

public class Assignment22 {
    public static void main(String[] args) {
        //given indexes are the 2D arrays indexes.we need just print
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";
        System.out.println(Arrays.deepToString(shirts));
    }
}

