package Logical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringLogic {
    @Override
    public String toString() {
        return "StringLogic{}";
    }

    public static void main(String[] args) {


        String s = "HiiI am Aji1 pan_0i9o";
        List list = new ArrayList<String>();
        int length;
        char s2;
        String str=null;
        String str1;
        String str2;
        String str3="";
        String[] s1 = s.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();


        for (int i=0 ;i<s1.length;i++){
//            length = (int) (s1[i].length()-1);
//            str = s1[i];
            str1 = s1[i].substring(s1[i].length()-1);
            str2 = String.valueOf(s1[i+1].charAt(0));

            if (str1.matches("^[a-zA-Z]*$") && str2.matches("^[a-zA-Z]*$")){
               str3= str3 + s1[i];
//                       .concat(s1[i+1]);
                System.out.print("  "+str3);
            }else{
                System.out.println("Not a string");
            }
//            str3=str;
        }

        for (String i:s1){
            list.add(i);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){


            str = (String) iterator.next();
            length = str.length()-1;
                   s2 = str.charAt(length);

            System.out.print(iterator.next().toString() + " ");
        }
        String[] s3 = s.split("_");

        System.out.println(" Second String "+s3.toString());
    }
}
