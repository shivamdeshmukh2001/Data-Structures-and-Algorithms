import java.util.Scanner;

public class RotateArray {


    static int[] rotateArray(int[] arr, int k){
        int n= arr.length;
        k=k%n;
        
        int[] ans = new int[n];
        int j=0;

        for (int i = n-k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i =0 ; i < n-k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    static void printArray(int[] ans){
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" Elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter number of rotation :");
        int k=sc.nextInt();
        System.out.println("Original Array :");
        printArray(arr);


        System.out.println();
        int[] ans = rotateArray(arr, k);
        System.out.println("Array after "+k+" rotation :");
        printArray(ans);
        sc.close();
    }
}
