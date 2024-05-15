

//Find the number in an array or not 
// If not print -1

import java.util.Scanner;

public class NumberInArray {
    
    void Find(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Numbers in array :");
        int[] a= {12, 45, 67, 34, 98, 76 ,43, 98};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            
        }
        System.out.println();
        System.out.println("Enter number :");
        int number=sc.nextInt();
        int ans = -1;

        for (int i = 0; i < a.length; i++) {
            if(number==a[i]){
                ans= i;
                break;
            }
        }
        System.out.println(number+" is Present in an array at index " + ans);
    }

    public static void main(String[] args) {
        NumberInArray num = new NumberInArray();
        num.Find();
    }
}
