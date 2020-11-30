package december5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int f = 1034;
        tidyNumber(f);
    }
    public static boolean tidyNumber(int number) {
        boolean flag = false;
        LinkedList<Integer> nums = new LinkedList<>();
        while (number != 0) {
            nums.addFirst(number % 10);
            number /= 10;
        }
        for (int i = 0; i < nums.size()-1; i++){
            if(nums.get(i) <= nums.get(i + 1) ){
                flag = true; 
            } else {
                flag = false;
                break;
            }
        }
        return flag; // Do your magic!
    }

}

//Notes
//        Number passed is always Positive .
//
//        Return the result as a Boolean
//
//        Input >> Output Examples
//        tidyNumber (12) ==> return (true)
//        Explanation:
//        The number's digits { 1 , 2 } are in non-Decreasing Order (i.e) 1 <= 2 .
//
//        tidyNumber (32) ==> return (false)
//        Explanation:
//        The Number's Digits { 3, 2} are not in non-Decreasing Order (i.e) 3 > 2 .
//
//        tidyNumber (1024) ==> return (false)
//        Explanation:
//        The Number's Digits {1 , 0, 2, 4} are not in non-Decreasing Order as 0 <= 1 .
//
//        tidyNumber (13579) ==> return (true)
//        Explanation:
//        The number's digits {1 , 3, 5, 7, 9} are in non-Decreasing Order .
//
//        tidyNumber (2335) ==> return (true)
//        Explanation:
//        The number's digits {2 , 3, 3, 5} are in non-Decreasing Order , Note 3 <= 3
