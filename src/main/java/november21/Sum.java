package november21;

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        return sum1 + sum2;
    }

}
//I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements.
// I'll appreciate for your help.
//
//        P.S. Each array includes only integer numbers. Output is a number too.
