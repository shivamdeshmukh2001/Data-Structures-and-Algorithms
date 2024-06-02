
// Find the last repeating element fro given array.

import java.util.Scanner;

public class LastRepeatingElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n= sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+ " elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Last repeating array is : "+ lastRepeatingElement(arr));
        sc.close();
    }

    static int lastRepeatingElement(int[] arr){
        int ans= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                }
            }
        }
        return ans;
    }
}
