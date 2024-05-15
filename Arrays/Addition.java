public class Addition {
    
    void sumOfArray(){
        int[] a={ 10,20,30,40,50};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        System.out.println("Total Sum :"+ sum);

    }

    public static void main(String[] args) {
        Addition obj= new Addition();
        obj.sumOfArray();
    }
}
