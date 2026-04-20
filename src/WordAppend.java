import java.util.*;
public class WordAppend {
    public static void main(String[] args) {

        String[] input = {"a", "b", "a"};

        System.out.println(wordAppend(input));

    }

    public static String wordAppend(String[] strings) {

        Map<String, Integer> countMap = new HashMap<>();

        String result = "";

        for (String str : strings) {

            if (countMap.containsKey(str)) {

                countMap.put(str, countMap.get(str) + 1);
            }else{
                countMap.put(str, 1);
            }

            if (countMap.get(str) % 2 == 0) {
                result+= str;

            }
        }
        return result;
    }

    }
