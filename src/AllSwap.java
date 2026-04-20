import java.util.*;

public class AllSwap {
    public static void main(String[] args) {

        String[] input = {"ab", "ac"};

        System.out.println(java.util.Arrays.toString(allSwap(input)));

    }

    public static String[] allSwap(String[] strings) {

        Map<Character, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            char key = strings[i].charAt(0);

            if (indexMap.containsKey(key)) {
                int prevIndex = indexMap.get(key);

                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;

                indexMap.remove(key);

            } else {
                indexMap.put(key, i);
            }


        }
        return strings;

    }
}

