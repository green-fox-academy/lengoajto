import java.util.Arrays;

public class RotatedMatrix {

    private static int[][] matrix = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
    };

    private final static int N = 4;

    private static void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print();

        for (int ring = 0; ring < N / 2; ring++) {
            int farthest = N - ring - 1;

            for (int i = ring; i < farthest; i++) {
                int temp = matrix[ring][i];
                matrix[ring][i] = matrix[farthest - i + ring][ring];
                matrix[farthest - i + ring][ring] =
                        matrix[farthest][farthest - i + ring];
                matrix[farthest][farthest - i + ring] =
                        matrix[i][farthest];
                matrix[i][farthest] = temp;
            }
        }

        print();
    }
}




/*

public class RotatedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotatedMatrix = rotateMatrix(matrix);

        Arrays.stream(rotatedMatrix)
                .forEach(row -> System.out.println(Arrays.toString(row)));
        }
    }

}
// Create a function named `rotateMatrix` that takes an n×n integer matrix (array of arrays) as parameter
// and returns a matrix which elements are rotated 90 degrees clockwise.
//
// example input:
// [[1, 2, 3],
// [4, 5, 6],
// [7, 8, 9]]


// should print
// [7, 4, 1]
// [8, 5, 2]
// [9, 6, 3]
*/