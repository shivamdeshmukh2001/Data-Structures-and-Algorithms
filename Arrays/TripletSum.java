

// Find the total number of Triplets from Array whose Sum equal to target value 

import java.util.Scanner;

public class TripletSum {
    static int ans=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter "+n+ " Elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter target sum :");
        int target=sc.nextInt();

        System.out.println("Triplet whose sum "+target+" are:");
        tripletSum(arr,target);
        System.out.println("Number of triplets in array whose sum is "+target+" are : "+ans);

        sc.close();
    }

    static int tripletSum(int[] arr, int target) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] ==target) {
                        ans++;
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                    
                }
            }
            
        }
        return ans;
    }

    
}
