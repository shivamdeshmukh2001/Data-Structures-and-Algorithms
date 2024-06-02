
//Find second smallest value.

import java.util.Scanner;

public class SecondMinValue {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements :");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Second Smallest value in Array is : "+ secondMin(arr));

        sc.close();
    }

    static int minValue(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    static int secondMin(int[] arr){
        int min=minValue(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== min){
                arr[i]=Integer.MAX_VALUE;
            }
        
        }
        int SecondMin = minValue(arr);
        return SecondMin;
    }
    
}
