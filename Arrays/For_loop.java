public class For_loop {
    

    void loop(){

        System.out.println("1-D Array");

        int[] a= new int[5];
        a[0]=12;
        a[1]=23;
        a[2]=45;
        a[3]=56;
        a[4]=88;


        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }


        System.out.println("2-D Array");
        int[][] age = new int[2][2];
        age[0][0] = 22;
        age[0][1] = 10;
        age[1][0] = 79;
        age[1][1] = 51;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(age[i][j]);
            }
            
        }

    }


    public static void main(String[] args) {
        For_loop obj = new For_loop();
        obj.loop();
    }
}
