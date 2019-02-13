
import java.util.Arrays;


public class LargerMatrixShouldPrint {
    public static void main(String[] args) {

        int[][] firstMatrix = {{1, 2, 3,}, {4, 5, 6,}, {7, 8, 9}};
        int[][] secondMatrx = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] thirdMatrix = {{5, 1}, {1, 7}};
        int[][] fourthMatrix = {{43, 56,}, {2, 2}};

        System.out.println(Arrays.deepToString(newBIggerMatrix(firstMatrix, secondMatrx)));
        System.out.println(Arrays.deepToString(newBIggerMatrix(thirdMatrix, fourthMatrix)));
    }

    public static int[][] newBIggerMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] newMatrix = new int[firstMatrix.length][secondMatrix.length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++) {
                if (firstMatrix[i][j] > secondMatrix[i][j]) {
                    newMatrix[i][j] = firstMatrix[i][j];
                } else {
                    newMatrix = secondMatrix;
                }
            }
        }
        return newMatrix;
    }
}
