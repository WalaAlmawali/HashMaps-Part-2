import java.util.*;

public class WordCount {
    public static void main(String[] args) {

        String[] input = {"a", "b", "a", "c", "b"};
        Map<String, Integer> result = new HashMap<>();

        for (String in : input) {

            if (result.containsKey(in)) {
                result.put(in, result.get(in) + 1);
            } else {

                result.put(in, 1);
            }

    }

}

    }
