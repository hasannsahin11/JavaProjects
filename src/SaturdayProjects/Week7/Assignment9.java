package SaturdayProjects.Week7;

public class Assignment9 {

    // this program has a nested loop. It runs from first element in array starting from 1st array (index 0) + letter at index 0
    // it prints out the letters from 1st array until it'll catch "B". After it finds "B" it'll break (get out) from the j-loop
    // however the first fori loop will keep executing: "DE" since the break only for the last loop.
    // the executed result we will get is: ABDE

    public static void main(String[] args) {
        String[][] arr = {{"A","B","C"},{"D","E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                if (arr[i][j].equals("B")){
                    break;
                }
            }
        }
    }
}
