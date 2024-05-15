public class MaxOfArray {
    

    static void Maximum(){
        int[] arr = { 12, 34, 56, 23, 30, 11, 98, 20, 120};
        int max= arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max ){
                max = arr[i];

            }
            
        }
        System.out.println("Maximum value in array :" + max);

    }

    public static void main(String[] args) {
        Maximum();
    }
}
