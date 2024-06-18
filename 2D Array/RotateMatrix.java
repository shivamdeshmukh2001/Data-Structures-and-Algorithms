import java.util.Scanner;

public class RotateMatrix {

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][] matrix, int rows, int cols){
        for (int i = 0; i < cols; i++) {
            for(int j = i; j < rows; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // static void transpose(int[][] matrix,int rows,int cols){
    //     int[][] ans = new int[cols][rows];
    //     for (int i = 0; i < cols; i++) {
    //         for (int j = 0; j < rows; j++) {
    //             ans[i][j] = matrix[j][i];
    //         }
    //     }
    //     System.out.println("Transposed matrix :");
    //     printMatrix(ans);
    // }

    static void reverseMatrix(int[] arr){
        int i=0, j=arr.length-1 ;

        while (i < j) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    static void rotate(int[][] matrix, int rows, int cols){
        transposeInPlace(matrix, rows, cols);

        for (int i = 0; i < rows; i++) {
            reverseMatrix(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of matrix :");
        System.out.print("Rows :");
        int r1=sc.nextInt();
        System.out.print("Columns :");
        int c1= sc.nextInt();
        int[][] matrix = new int[r1][c1];
        System.out.println("Enter "+r1*c1+" elements of matrix-1 :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Original Matrix :");
        printMatrix(matrix);

        rotate(matrix, r1, c1);
        System.out.println("Rotated Matrix :");
        printMatrix(matrix);

        sc.close();
    }
}
