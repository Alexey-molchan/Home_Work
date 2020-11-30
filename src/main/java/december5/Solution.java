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
