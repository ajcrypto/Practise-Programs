package Logical;

public class SumOfNumbers {

    static int s =0;
    public static int sum(int a){


        if (a ==0)
            return 0;
        else
            s = (a %10) + sum(a/10);

        return s;
    }

    public static void main(String[] args) {
        int a = 1987;
        int s=0;
//        s = a %10 + (a/10)%10 + (a/100)%10 + a/1000;

       /* while (a!=0){
            s = s + a%10;
            a = a/10;
        }

        System.out.print(s)*/;
        System.out.print(sum(1987));


    }
}
