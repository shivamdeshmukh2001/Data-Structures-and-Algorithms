
import java.util.Scanner;

public class PartitionOfArray{

    static int findArraySum(int[] arr){
        int totalSum =0;
        for (int i = 0; i < arr.length; i++) {
            totalSum +=arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);

        int prefixSum =0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (suffixSum == prefixSum) {
                return true;
            }
        }
        return false;
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

        System.out.println("Equal partition possible :" + equalSumPartition(arr));

        sc.close();
    }
}
