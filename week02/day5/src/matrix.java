import java.util.Arrays;

public class matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length ; i++) {
            matrix[i][i] = 1;

        System.out.println(Arrays.toString(matrix[i]));
        }
    }
}

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output