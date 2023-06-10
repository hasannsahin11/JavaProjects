package SaturdayProjects.Week7;

public class Assignment2 {
    public static void main(String[] args) {

        // AAA
        int[][] arr = new int[2][];
        System.out.println(arr);

        // BBB
        double [][] arr1 = new double[][]{
                {1,2},
                {3,4}
        };
        System.out.println(arr1);

        /// CCC Is the one giving compile error when you declare the size of the array and initialize it at the same time
        long[][] arr2 = new long[][]{
            {1,2},
            {3,4}
        };

        /// DDD
        int[][] arr3 = {
                {'A','B'},
                {'C','D'}
        };
        System.out.println(arr3);
    }
}
