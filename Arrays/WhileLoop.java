public class WhileLoop {
    void loop(){
        int[] a= new int[5];
        a[0]=45;
        a[1]=66;
        a[2]=76;
        a[3]=98;
        a[4]=55;


        int i=0;
        while(i<5){
            System.out.println(a[i]);
            i++;
        }
    }


    public static void main(String[] args) {
        WhileLoop obj = new WhileLoop();
        obj.loop();
    }
}
