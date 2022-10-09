package arrays;
import java.util.Scanner;

public class MatrixMultiplucation2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter dimensions of first matrix

        System.out.println("Enter Dimensions of first matrix:");
        System.out.println();

        System.out.print("Number of ROW : ");
        int rows = sc.nextInt();
        System.out.print("Number of COLUMNS : ");
        int cols = sc.nextInt();

        System.out.println();

        // Enter dimensions of second matrix

        System.out.println("Enter Dimensions of second matrix");
        System.out.println();

        System.out.println("Number of ROW : " + cols);                        // columns of first matrix = rows of second matrix
        System.out.print("Number of COLUMNS : ");
        int colsScondMatrix = sc.nextInt();

        // creating arrays

        int a[][] = new int[rows][cols];
        int b[][] = new int[cols][colsScondMatrix];
        int result[][] = new int[rows][colsScondMatrix];

        // initializing first array

        System.out.println("Enter first array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second array:");

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < colsScondMatrix; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // // transpose of second matrix

        // int bTranspose[][] = new int[colsScondMatrix][cols];

        // for (int i = 0; i < cols; i++) {
        //     for (int j = 0; j < colsScondMatrix; j++) {
        //         bTranspose[j][i] = b[i][j];
        //     }
        // }



        // multiplying first and second matrix

        System.out.println("Result array:");

        for (int k = 0; k < rows; k++) {
            for (int i = 0; i < colsScondMatrix; i++) {
                for (int j = 0; j < cols; j++) {
                    result[k][i] += a[k][j] * b[j][i];
                }
            }
        }

        // output

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colsScondMatrix; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    
    }
}
