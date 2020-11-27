package november28;

public class Zow {
    public static void main(String[] args) {
        String[] strings = {"sheep", "sheep", "wolf"};
        warnTheSheep(strings);

    }


        public static String warnTheSheep(String[] array) {
            String sheep = "sheep";
            String wolf = "wolf";
            String result = null;
            int count = 0;
            for(int i = array.length-1; i >= 0; i--){
                if(array[i].equals(wolf) && count != 0){
                    result = "Oi! Sheep number " + count + "! You are about to be eaten by a wolf!";
                } else if (array[array.length - 1].equals(wolf)){
                    result = "Pls go away and stop eating my sheep";
                }
                count++;
            }
            return result;
        }

}
//
//    Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves
//    which pretend to be sheep. Fortunately, you are good at spotting them.
//
//        Warn the sheep in front of the wolf that it is about to be eaten.
//        Remember that you are standing at the front of the queue which is at the end of the array:
//
//        [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
//        7      6      5      4      3            2      1
//        If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep".
//        Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!"
//        where N is the sheep's position in the queue.
//
//        Note: there will always be exactly one wolf in the array.

