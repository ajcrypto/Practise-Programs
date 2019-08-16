package Logical;

public class CubeRecursive {
    static int s =0;
     public static int cube(int base,int power){

         if (power!=1) {
             base = base * cube(base, power - 1);
             System.out.print(" " + base);
         }

         return base;


    }

    public static void main(String[] args) {

        int base =2;
        int power =5;


       cube(base,power);
    }
}
