package Logical;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {

        // TwoSum using array
        int[] number = new int[]{2,7,1,8,9};
        int target = 13;
        int [] result = getTwoNumbers(number,target);
        System.out.println(result[0] +"  "+result[1]);

        // TwoSum using ArrayList
        List<Integer> list = Arrays.asList(2,9,4,8,5);
        int [] resultList = getTwoNumbersList(list,target);
        System.out.println(resultList[0] +"  "+resultList[1]);

    }



    private static int[] getTwoNumbers(int[] number, int target) {
        Map<Integer,Integer> visitedNumbers = new HashMap<>();

        for (int i =0;i<number.length;i++){
            int delta = target - number[i];
            if (visitedNumbers.containsKey(delta)){
                return new int[] {i ,  visitedNumbers.get(delta)};
            }
            visitedNumbers.put(number[i],i);

        }
        return new int[]{-1,-1};
    }

    private static int[] getTwoNumbersList(List<Integer> list, int target) {
        int index;
        int delta;

        for (int i = 0; i < list.size(); i++){
             delta = target - list.get(i);
            if (list.contains(delta)){
                index = list.indexOf(delta);
                return new int[] {i,index};
            }
        }
        return new int[]{-1,-1};
    }
}
