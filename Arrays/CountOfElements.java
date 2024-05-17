import java.util.*;

public class CountOfElements {

    static int countOccurences(int[] arr,int x){
        int count=0;
        for(int i=0;i < arr.length;i++){
            if(arr[i]==x){
                count++;
            };
        } 
        return count;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i < arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter X:");
        int x=sc.nextInt();
        System.out.print("Count of X:"+countOccurences(arr,x));
            }
}