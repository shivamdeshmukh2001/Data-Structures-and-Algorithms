import java.util.Scanner;

public class PrintSquareInSortedForm {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] sortSquare(int[] arr){
        int n= arr.length;
        int left=0 ,right= n-1;
        int k=0;
        int[] ans = new int[n];

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++]=arr[left] * arr[left];
                left++;
            }else{
                ans[k++]= arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    static void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]= temp;
    }

    static void reverse(int[] arr){
        int i=0, j= arr.length - 1;
        while (i < j) {
            swap(arr, j, i);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int n= sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Original array :");
        printArray(arr);
        int[] ans = sortSquare(arr);
        
        System.out.println("Square of Sorted Array :");
        reverse(ans);
        printArray(ans);
        

        sc.close();
    }
}
