package SaturdayProjects.Week7;

public class Assignment13 {
    public static void main(String[] args) {
        //135 means every other element
        // 1 then 3 then 5,so we should create the formula that is i=i+2.
        int[] arr1 = {1, 2, 3, 4, 5};
        for (int i = 0; i <arr1.length ; i=i+2) {
            System.out.print(arr1[i]);
        }

    }
}