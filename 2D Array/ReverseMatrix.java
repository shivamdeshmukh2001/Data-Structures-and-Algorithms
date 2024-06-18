import java.util.Scanner;

public class ReverseMatrix {

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void reverseMatrixRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        printMatrix(matrix);
    }

    public static int[][] reverseMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] reversedMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                reversedMatrix[rows - 1 - i][j] = matrix[i][j];
            }
        }
        return reversedMatrix;
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

        System.out.println("Original Matrix :");
        printMatrix(matrix1);

        System.out.println("Reversed Matrix - Column wise :");
        int[][] mat = reverseMatrix(matrix1);
        printMatrix(mat);

        System.out.println("Reversed Matrix - Row wise :");
        reverseMatrixRows(matrix1);
        sc.close();
    }
}
