package Logical;

public class Factorial {

    public static int fact(int n){

      if(n==0)
          return 1;
      else
         return n * fact(n - 1);

    }

    public static void main(String[] args) {
        int n=5;
        int f = 1;

        for (int i=1; i<=n;i++){
            f = f*i;
        }

        System.out.println(f);

        System.out.println("Factorial Recursion: "+fact(5));

    }
}
