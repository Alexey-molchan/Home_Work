public class School {
    public static int getAverage(int[] marks) {
        int average = 0;
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            average += marks[i];
            count++;
        }
        return average / count;
    }

}

//It's the academic year's end, fateful moment of your school report.
// The averages must be calculated. All the students come to you and entreat you to calculate their
// average for them. Easy ! You just need to write a script.
//
//        Return the average of the given array rounded down to its nearest integer.
//
//        The array will never be empty.




