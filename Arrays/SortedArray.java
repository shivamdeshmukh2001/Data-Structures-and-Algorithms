
import java.util.*;
public class SortedArray {
    static boolean check =true;
    static boolean isSorted(int[] arr){
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]< arr[i-1]){
                check = false;
                break;
            }
        }
        
        return check;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        isSorted(arr);
        if(check == true){
            System.out.print("Array is Sorted ");

        }
        
        else{
            System.out.print("Array is not Sorted");

        }
    }
}