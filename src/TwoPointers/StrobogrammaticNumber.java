package TwoPointers;
/*

Given a string num representing an integer, determine whether it is a strobogrammatic number. Return TRUE if the number is strobogrammatic or FALSE if it is not.

A strobogrammatic number appears the same when rotated 180  degrees (viewed upside down). For example, “69” is strobogrammatic because it looks the same when flipped upside down, while “962” is not.
*/

import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber {

    public static boolean isStrobogrammatic (String num)
    {
        Map<Character,Character> numberMap = new HashMap<>();
        numberMap.put('0','0');
        numberMap.put('1','1');
        numberMap.put('2','5');
        numberMap.put('5','2');
        numberMap.put('6','9');
        numberMap.put('8','8');
        numberMap.put('9','6');

        int i=0,j=num.length()-1;

        while(i<=j){
            if(!numberMap.containsKey(num.charAt(i)) || !numberMap.containsKey(num.charAt(j))){
                return false;
            }
            if(num.charAt(i) != numberMap.get(num.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] nums = {
                "609",
                "88",
                "962",
                "101",
                "123",
                "66"
        };

        int i = 0;
        for (String num : nums) {
            System.out.println((i + 1) + ".\tnum: " + num);
            System.out.println("\n\tIs strobogrammatic: " + (isStrobogrammatic(num) ? "true" : "false"));
            System.out.println(new String(new char[100]).replace("\0", "-"));
            i++;
        }
    }
}
