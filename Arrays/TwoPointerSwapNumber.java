import java.util.Scanner;


public class TwoPointerSwapNumber {


    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]= temp;
    }

    

    static void sortZeroesAndOnes(int[] arr){

        int n =arr.length;
        // int zeroes =0;
        int left =0;
        int right = n-1;

        // count no of zeroes
        // for (int i = 0; i < n; i++) {
        //     if(arr[i]==0){
        //         zeroes++;
        //     }
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     if (i < z) {
        //         arr[i]=0;
        //     } else {
        //         arr[i]=1;
        //     }
        // }

        while (left < right) {
            if(arr[left] == 1 && arr[right] ==0){
                swap(arr, left,right);
                left++;
                right--;
            }

            if (arr[left] ==0) {
                left++;
            }

            if (arr[right] ==1) {
                right--;
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
