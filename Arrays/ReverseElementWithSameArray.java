import java.util.Scanner;

public class ReverseElementWithSameArray {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swapArray(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void reverseElement(int[] arr){
        int i=0, j=arr.length-1;
        while (i < j) {
            swapArray(arr, i, j);
            i++;
            j--;
        }

        
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int n= sc.nextInt();
        int[] arr =new int[n];


        System.out.println("Enter "+n+" Elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }



        System.out.println();
        System.out.println("Reversed Array :");
        reverseElement(arr);
        printArray(arr);


        sc.close();
    }

}
