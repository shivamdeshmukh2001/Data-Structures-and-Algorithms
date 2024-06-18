import java.util.Scanner;

public class TransposeMatrix {

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }
    }

    static int[][] trans(int[][] matrix, int rows, int cols){
        int[][] transposedMatrix = new int[cols][rows];
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter dimensions of Matrix :");
        System.out.print("Rows :");
        int rows = sc.nextInt();
        System.out.print("Columns :");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter "+rows*cols+" elements of Matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Original Matrix :");
        printMatrix(matrix);

        System.out.println("Transposed Matrix :");
        int[][] ans = trans(matrix, rows, cols);
        printMatrix(ans);

        sc.close();
    }
}
