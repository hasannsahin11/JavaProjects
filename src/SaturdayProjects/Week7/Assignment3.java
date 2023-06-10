package SaturdayProjects.Week7;

public class Assignment3 {
    // This will print only first 2 elements of each array ref: line9   sout: will be: 1 2 3 4
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 4}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
