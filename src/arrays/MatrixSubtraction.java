package arrays;
import java.util.Scanner;

public class MatrixSubtraction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input dimensions

        System.out.println("Enter Dimensions:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];
        int c[][] = new int[rows][cols];
        
        // imput first array

        System.out.println("Enter first array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                a[i][j] = sc.nextInt();
            }
        }

        // input second array

        System.out.println("Enter second array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                b[i][j] = sc.nextInt();
            }
        }

        // subtracting them

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                c[i][j] = a[i][j] - b[i][j];
            }
        }

        // output

        System.out.println("Result array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                System.out.print(c[i][j]);
            }
            System.out.println();
        }

        sc.close();

    }
    
}
