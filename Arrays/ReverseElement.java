
// Reverse the array

import java.util.Scanner;

public class ReverseElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n= sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+ " elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        System.out.println();

        int[] ans =reverseElement(arr);
        System.out.println("Reversed Array :");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        

        sc.close();
    }

    static int[] reverseElement(int[] arr) {
        int n= arr.length;
        int[] ans = new int[n];
        int j=0;
        for (int i = n-1 ; i >= 0 ; i--) {
            ans[j++]=arr[i];
        }
        return ans;

    }
}

