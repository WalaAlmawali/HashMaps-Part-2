import java.util.*;

public class WordMultiple {
    public static void main(String[] args) {

        String[] input = {"a", "b", "a", "c", "b"};

        System.out.println(wordMultiple(input));


    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Boolean> wordMultipleMap = new HashMap<>();


        for (String str : strings) {

            if (countMap.containsKey(str)) {

                countMap.put(str, countMap.get(str) + 1);
            }else{
                countMap.put(str, 1);
            }
            if (countMap.get(str) % 2 == 0) {
                wordMultipleMap.put(str, true);

            }else{

                wordMultipleMap.put(str, false);

            }

            }
        return wordMultipleMap;

    }





    }






