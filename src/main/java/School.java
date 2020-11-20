import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class School {

    public static int getAverage(int[] marks) {
        int average = 0;
        for (int a : marks) {
            average += a;
        }
        return average / marks.length;
    }

}

//It's the academic year's end, fateful moment of your school report.
// The averages must be calculated. All the students come to you and entreat you to calculate their
// average for them. Easy ! You just need to write a script.
//
//        Return the average of the given array rounded down to its nearest integer.
//
//        The array will never be empty.




