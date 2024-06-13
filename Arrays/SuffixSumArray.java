import java.util.Scanner;

public class SuffixSumArray {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+" ");
        }
    }

        static  int[] suffixSumArray(int[] arr){
            int n = arr.length;
            for (int i = n-2; i >= 0; i--) {
                arr[i] = arr[i] + arr[i+1];
            }
            return arr;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n= sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt(); 
        }

        int[] suffixSum = suffixSumArray(arr);

        System.out.println("Suffix sum is :");
        printArray(suffixSum);

        sc.close();
    }
}
