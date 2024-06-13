import java.util.Scanner;

public class SumOfRangeQuery {

    static int[] prefixSumArray(int[] arr){
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n =sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter "+n+" elements :");
        for (int i = 1; i <= n; i++) {
            arr[i]=sc.nextInt();
        }

        int[] prefixSum = prefixSumArray(arr);

        System.out.println("Number of queries :");
        int q=sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter range");
            int l=sc.nextInt();
            int r=sc.nextInt();

            int ans = prefixSum[r] - prefixSum[l-1];

            System.out.println("Sum : "+ ans);
        }

        sc.close();
    }
}
