package december12;


import java.util.LinkedList;

public class Drinkin {
    public static void main(String[] args) {
        String str = "1 2 3 beer";
        Drinkin drinkin = new Drinkin();
        drinkin.hydrate(str);
    }

    public String hydrate(String drinkString) {
        int value = Integer.parseInt(drinkString.replaceAll("[^0-9]", ""));
        int result = 0;

        while (value > 0){
            result += value % 10;
            value /= 10;
        }

        if (result < 2) {
            return result + " " + "glass of water";
        } else {
            return result + " " + "glasses of water";
        }

    }
}

//    Codewars Bar recommends you drink 1 glass of water per standard drink so you're not
//    hungover tomorrow morning.
//
//        Your fellow coders have bought you several drinks tonight in the form of a string.
//        Return a string suggesting how many glasses of water you should drink to not be hungover.

