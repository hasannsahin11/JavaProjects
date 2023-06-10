package SaturdayProjects.Week7;

public class Assignment15 {
    public static void main(String[] args) {
        //public static int findMax(int []num){}'
        int[] numbers = {1, 2, 3, 4, 5};
        int max = findMax(numbers);
        System.out.println(max);
    }

    public static int findMax(int[] num) {
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];

            }
        }
        return max;
    }
}
