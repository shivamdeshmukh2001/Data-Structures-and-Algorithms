

//Find the smallest value in an array.


import java.util.Scanner;

public class MinValue {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements :");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Smallest value in Array is : "+ minValue(arr));

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
    
}
