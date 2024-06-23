import java.util.Scanner;

public class MatrixAddition {

    static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
        }
    }

    static void add(int[][] A,int row1, int col1, int[][] B, int row2,int col2){
        if (row1 != row2 || col1 != col2) {
            System.out.println("Wrong input - Addition not possible");
            return;
        }
        
        int[][] sum = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Sum of Matrix A and Matrix B is :");
        printMatrix(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for matrix A: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] A = new int[row1][col1];
        System.out.println("Enter the elements of matrix A: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                A[i][j]= sc.nextInt();
            }
        }


        System.out.println("Enter the number of rows and columns for matrix B: ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] B = new int[row2][col2];
        System.out.println("Enter the elements of matrix B: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                B[i][j]= sc.nextInt();
            }
        }

        System.out.println("Matrix A");
        printMatrix(A);
        System.out.println("Matrix B");
        printMatrix(B);

        add(A, row1, col1, B, row2, col2);


        sc.close();

    }
}
