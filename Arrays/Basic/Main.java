package Basic;


class ArrayExample{
    void demo(){
        int[] arr= new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        // System.out.println(arr[5]); ArrayIndexOutOfBoundException

    }
}



public class Main{
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demo();

    }
}
