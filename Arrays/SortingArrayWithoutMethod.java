
import java.util.Scanner;

public class SortingArrayWithoutMethod {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array :");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter "+n+" elements :");

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        
        
        System.out.println("Sorted array :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp=0;
                if (arr[i]> arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }
            System.out.print(arr[i] + " ");
        }

        
        sc.close();
    }
}
