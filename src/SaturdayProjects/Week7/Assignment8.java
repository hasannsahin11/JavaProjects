package SaturdayProjects.Week7;

public class Assignment8 {
    public static void main(String[] args) {
        // It will start from the last array and will be printing from index of 0
        // then it will go to first array and will print from the index of 0
        int[][] arr = {{1, 2}, {3, 4}};
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
