package arrays;
import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float rows, cols;

        // taking values of row and column

        do {
            System.out.print("Enter the number of rows of both matrixes : ");
            rows = sc.nextFloat();
            System.out.print("Enter the number of columns of both matrixes : ");
            cols = sc.nextFloat();

            if (rows != (int)rows || cols != (int)cols || rows <= 0 || cols <= 0){
                System.out.println();
                System.out.println("Number of Rows and Columns should be a  POSITIVE INTEGER !!");
                System.out.println();
            }
        } while(!(rows == (int)rows && cols == (int)cols && rows > 0 && cols > 0));

        // creating matrix

        double a[][] = new double[(int)rows][(int)cols];
        double b[][] = new double[(int)rows][(int)cols];
        double result[][] = new double[(int)rows][(int)cols];

        // taking the values of elements of first matrix

        System.out.println();

        System.out.println("To enter the first matrix Hit Return");
        sc.nextLine();
        sc.nextLine();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                System.out.print("Enter the value of element of " + (i + 1) + "th row " + (j + 1) + "th column : ");
                a[i][j] = sc.nextDouble();
            }
        }

        // taking the values of elements of second matrix

        System.out.println();

        System.out.println("To enter the second matrix Hit Return");
        sc.nextLine();
        sc.nextLine();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                System.out.print("Enter the value of element of " + (i + 1) + "th row " + (j + 1) + "th column : ");
                b[i][j] = sc.nextDouble();
            }
        }

        System.out.println();

        // adding them

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        // result output

        System.out.println("The final matrix after addition:");
        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


        sc.close();

    }
    
}
