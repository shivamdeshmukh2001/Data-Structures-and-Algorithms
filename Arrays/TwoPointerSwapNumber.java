import java.util.Scanner;


public class TwoPointerSwapNumber {


    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    

    static void sortZeroesAndOnes(int[] arr){

        int n =arr.length;
        int zeroes =0;

        // count no of zeroes
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                zeroes++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < zeroes) {
                arr[i]=0;
            } else {
                arr[i]=1;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter "+n+" elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array :");
        printArray(arr);
        sortZeroesAndOnes(arr);
        System.out.println("Sorted Array :");
        printArray(arr);


        sc.close();
    }
}
