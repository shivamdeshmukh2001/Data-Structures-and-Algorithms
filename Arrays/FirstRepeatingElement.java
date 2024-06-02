
//Find the first repeating element from given array.

import java.util.Scanner;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array :");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("First repeated element in array is "+ firstRepeatedElement(arr));

        sc.close();
    }

    static int firstRepeatedElement(int[] arr) {
        int ans= -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
