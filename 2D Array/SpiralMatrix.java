import java.util.Scanner;

public class SpiralMatrix {

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void printSpiralMatrix(int[][] matrix, int rows, int cols){
        int TopRow = 0, BottomRow = rows -1, LeftCol = 0, RightCol = cols -1;
        int totalElements =0;

        while (totalElements < rows * cols) {
            for (int j = LeftCol; j <= RightCol && totalElements < rows*cols; j++) {
                System.out.print(matrix[TopRow][j]+" ");
                totalElements++;
            }
            TopRow++;

            for (int i = TopRow; i <= BottomRow && totalElements < rows*cols; i++) {
                System.out.print(matrix[i][RightCol]+" ");
                totalElements++;
            }
            RightCol--;

            for (int j = RightCol; j >= LeftCol && totalElements < rows*cols; j--) {
                System.out.print(matrix[BottomRow][j]+ " ");
                totalElements++;
            }
            BottomRow--;

            for (int i = BottomRow; i >= TopRow && totalElements < rows*cols; i--) {
                System.out.print(matrix[i][LeftCol]+" ");
                totalElements++;
            }
            LeftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter rows :");
        int rows = sc.nextInt();
        System.out.print("Enter columns :");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int totalElements = rows * cols;

        System.out.println("Enter "+totalElements+" elements :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }

        System.out.println("Original matrix :");
        printMatrix(matrix);

        System.out.println("Spiral Matrix :");
        printSpiralMatrix(matrix, rows, cols);

        sc.close();
    }
}
