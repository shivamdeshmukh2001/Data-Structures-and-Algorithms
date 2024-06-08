import java.util.Scanner;

public class NumberPresentinarray {


    static int[] makeFrequencyArray(int[] arr){

        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }


    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array :");
    int n= sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter "+n+" elements :");
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }

    int[] freq = makeFrequencyArray(arr);

    System.out.print("Enter number of queries :");
    int q=sc.nextInt();

    while (q > 0) {
        System.out.println("Enter number to be search :");
        int x = sc.nextInt();
        if(freq[x] > 0){
            System.out.println(x +" present in an array");
        }else{
            System.out.println(x+" not present in an array");
        }
        q--;
    }

    sc.close();
    }
}
