import java.util.*;

public class FirstChar {
    public static void main(String[] args) {



    }
    public static Map<String, String> firstChar(String[] words) {

        Map<String, String> result = new HashMap<>();
        for (String word : words) {

            String firstChar = word.substring(0, 1);

            if (result.containsKey(firstChar)) {

                result.put(firstChar, result.get(firstChar) + word);
            } else {

                result.put(firstChar, word);
            }



        }




    }

    }
