


public class demo {

    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int[][] arr = new int[2][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;

        System.out.println("print arr :");
        printArray(arr);

        int[][] arr2 = {{1,2,3},{4,5},{6,7,8,9}};
        System.out.println("print arr2 :");
        printArray(arr2);
    }
}
