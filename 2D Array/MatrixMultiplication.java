import java.util.Scanner;

public class MatrixMultiplication {

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void matrixMul(int[][] matrix1, int r1, int c1, int[][] matrix2, int r2, int c2){
        if (c1 != r2) {
            System.out.println("Matrix multiplication impossible - Invalid dimensions. ");
            return;
        }
        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }
        
        System.out.println("Multiplication of Matrix-1 and Matrix-2 is :");
        printMatrix(mul);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of matrix-1 :");
        System.out.print("Rows :");
        int r1=sc.nextInt();
        System.out.print("Columns :");
        int c1= sc.nextInt();
        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter "+r1*c1+" elements of matrix-1 :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter dimensions of matrix-2 :");
        System.out.print("Rows :");
        int r2=sc.nextInt();
        System.out.print("Columns :");
        int c2= sc.nextInt();
        int[][] matrix2 = new int[r2][c2];
        System.out.println("Enter "+r2*c2+" elements of matrix-2 :");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix -1 :");
        printMatrix(matrix1);

        System.out.println("Matrix -2 :");
        printMatrix(matrix2);

        
        matrixMul(matrix1, r1, c1, matrix2, r2, c2);

        sc.close();
    }
}
