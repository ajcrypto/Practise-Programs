package Logical;

public class Palindrome {


    public void noPalindrome(int n){
        int s =0; int r;
        int temp = n;
        while (n>0){

            r = n%10;
            s = (s*10) + r;
            n = n/10;

        }

        if (temp==s){
            System.out.println("Number is palindrome");
        }

    }

    public void stringPalindrome(String n){

        String reverse="";

        for (int i= n.length()-1;i>=0;i--){
            reverse = reverse + n.charAt(i);
        }

        if (reverse.equalsIgnoreCase(n)){
            System.out.println("String is palindrome");
        }

    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.noPalindrome(121);
        palindrome.stringPalindrome("ARA");

    }
}
