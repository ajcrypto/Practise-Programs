package Logical;

public class PrimeNumber {

    public static boolean isPrime(int n){

        for (int i=2;i<=n/2;i++){
            if (n%i==0)
                return false;
        }

        return true;
    }

    public static void printPrimeNumbers(){

        boolean isPrime;
        int count=0;

        for (int i=2; i<=100; i++){
            isPrime= true;

            for (int j=2; j<i/2; j++){

                if (i%j==0){
                    isPrime = false;
                    break;
                }


            }
            if (isPrime){
                System.out.print(" "+i);
                ++count;
            }
        }

        System.out.println("Total Prime nos: "+count);

    }

    public static void main(String[] args) {
        int n=11;
//
//        if (isPrime(65757575))
//            System.out.println("Prime no");
//        else
//            System.out.println("Not a prime no");

        printPrimeNumbers();

    }

}
