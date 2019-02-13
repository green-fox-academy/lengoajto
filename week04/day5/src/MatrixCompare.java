//convert the matrix columns to rows

import java.util.Arrays;
import java.util.Scanner;

public class MatrixCompare {
    public static void main(String[] args) {

        int matrix[][] = new int[][] {{1, 2, 3 }, {4, 5, 6}, {8, 9, 10 }};

        for (int [] array:
             matrix) {
            for (int elem:
                 array) {
                System.out.println(elem);
            }
        }


        int transpose [][] = new int [9][9];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <i ; j++) {
                transpose [j][i] = matrix [i][j];

            }
        }
        /*System.out.println("Transpose of the given number is: ");
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <b ; j++) {

                System.out.println("%d\t" + transpose[i][j]);

            }
            
        }
        System.out.println();


    */}
}
