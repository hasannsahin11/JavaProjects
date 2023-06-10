package SaturdayProjects.Week7;

public class Assignment11 {
    // It will start from the first array and go into inner loop and it will run until it finds B
    // then it will go outer loop and run the second array since there is no B it will end up printing A D E
    public static void main(String[] args) {
        String[][] array = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals("B")) {
                    break;
                }
                System.out.println(array[i][j] + " ");
            }
        }
    }
}
