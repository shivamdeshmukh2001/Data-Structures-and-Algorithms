import java.util.Scanner;

public class EqualSumBetweenArray {

    static int[] prefixSumArray(int[] arr){
        int n= arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0]=arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i]=arr[i]+prefixSum[i-1];
        }
        return prefixSum;
    }

    static int[] suffixSumArray(int[] arr){
        int n=arr.length;
        int[] suffixSum =new int[n];
        suffixSum[n-1]=arr[n-1];
        for (int i = n-2; i >=0; i--) {
            suffixSum[i]=arr[i]+suffixSum[i+1];
        }
        return suffixSum;
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

        int[] prefixSum = prefixSumArray(arr);
        int[] suffixSum = suffixSumArray(arr);

        boolean found =false;

        for (int i = 0; i < n-1; i++) {
            if (prefixSum[i]==suffixSum[i+1]) {
                System.out.println("Found number");
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        sc.close();
    }
}







