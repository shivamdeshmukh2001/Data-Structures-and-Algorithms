import java.util.Scanner;

public class PairSum {

    static int pairSum(int[] arr,int target){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                
                if(arr[i]+arr[j]==target){
                    ans++;

                }
                
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        
        System.out.println("Enter "+n+" elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target sum:");
        int target=sc.nextInt();

        System.out.println("Targeted sum in array is:");
        System.out.println(pairSum(arr, target));
        sc.close(); 
    }
}
