import java.util.*;

public class WordLength {
    public static void main(String[] args) {

        String[] words = {"a", "bb", "a", "bb"};

        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {

            result.put(word, word.length());
        }

        System.out.println(result);

    }
}
