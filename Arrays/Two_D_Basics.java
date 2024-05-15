public class Two_D_Basics {

        void multiDimension() {
            // for int datatype
        int[][] a=new int[2][3];
        a[0][0]=12;
        a[0][1]=23;
        a[0][2]=45;
        a[1][0]=56;
        a[1][1]=88;
        a[1][2]=43;

        System.out.println(a[0][0]);
        System.out.println(a[0][1]);
        System.out.println(a[0][2]);
        System.out.println(a[1][0]);
        System.out.println(a[1][1]);
        System.out.println(a[1][2]);
        System.out.println("Enter Size of array :" + a.length);

        //for string datatype
        String[][] str=new String[3][3];
        str[0][0]="Shivam";
        str[0][1]="Rahul";
        str[0][2]="Pratap";
        str[1][0]="Sahil";
        str[1][1]="Gaurav";
        str[1][2]="Vishal";
        str[2][0]="Vinit";
        str[2][1]="Golu";
        str[2][2]="Mahesh";

        System.out.println(str[0][0]);
        System.out.println(str[0][1]);
        System.out.println(str[0][2]);
        System.out.println(str[1][0]);
        System.out.println(str[1][1]);
        System.out.println(str[1][2]);
        System.out.println(str[2][0]);
        System.out.println(str[2][1]);
        System.out.println(str[2][2]);
        System.out.println("Enter Size of array :" + str.length);

    }


    public static void main(String[] args) {
        Two_D_Basics obj = new Two_D_Basics();
        obj.multiDimension();
    }

}

