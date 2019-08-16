package Logical;

public class ArmstrongNumber {


    public static int armstrong(int n){

        int r;
        int s=0;
        int temp = n;
        while (n>0){
            r= n%10;
            s = s+ cube(r);
            n = n/10;
        }

       if (s == temp)
           System.out.println("Armstrong");
       else
           System.out.println("Not an Armstrong");

       return 0;
    }

    public static int cube(int n){
        return n*n*n;
    }

    public static void main(String[] args) {
        int n =153;

        System.out.println(armstrong(n));

    }
}
