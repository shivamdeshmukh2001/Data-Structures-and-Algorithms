public class ForEach {
    void loop(){

        //For 1-D Array
        int[] age= new int[5];
        age[0]=12;
        age[1]=23;
        age[2]=45;
        age[3]=56;
        age[4]=88;


        for(int x: age){
            System.out.println(x);
        }


        //for 2-D array
        int[][] size= {{1,2,3,4},{5,6,7},{8,9}};
        

        for(int[] a :size){
            for(int b:a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        ForEach obj = new ForEach();
        obj.loop();
    }
}
