package november28;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversWords {
    public String reverseWords(String str) {
        List<String> wordList = Arrays.asList(str.split(" "));
        Collections.reverse(wordList);

        StringBuilder sbReverseString = new StringBuilder();
        for(String word: wordList) {
            sbReverseString.append(word + " ");
        }

        return sbReverseString.substring(0, sbReverseString.length() - 1);
    }
}

