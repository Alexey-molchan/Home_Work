package november28;

public class Kata {
    public static void main(String[] args) {
        int [] array = {3,1,2,2};
        int n = 3;
        System.out.println(nthPower(array, n));
    }

    public static int nthPower(int[] array, int n) {
        int result = 0;
        for(int i = 0; i < array.length; i++){
            if(array.length-1 < n  ){
                result = -1;
            } else if(array.length-1 > n ||array.length-1 == n) {
                result = (int) Math.pow(array[n], n);
            }
        }
        return result;
    }
}

//    This kata is from check py.checkio.org
//
//        You are given an array with positive numbers and a number N.
//        You should find the N-th power of the element in the array with the index N.

//        Let's look at a few examples:
//
//        array = [1, 2, 3, 4] and N = 2, then the result is 3^2 == 9;
//        array = [1, 2, 3] and N = 3, but N is outside of the array, so the result is -1.