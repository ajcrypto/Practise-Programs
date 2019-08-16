package Logical;

public class SumRecursive {
    static int s= 0;
     static  int sum(int n){

         if (n==0)
             return 0;
       s= n + sum(n-1) ;
       System.out.print(" "+s);

       return s;

    }



    public static void main(String[] args) {
        int n = 10;

        sum(n);
    }
}
