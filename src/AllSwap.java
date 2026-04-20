import java.util.*;

public class AllSwap {
    public static void main(String[] args) {

        String[] input = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};

        System.out.println(java.util.Arrays.toString(allSwap(input)));

    }

    public static String[] allSwap(String[] strings) {

        Map<String, Integer> IndexMap = new HashMap<>();

        int i = 0;

        for (String x : strings) {

            String target = x.substring(0, 1);

            if (IndexMap.containsKey(target)) {

                int prevIndex = IndexMap.get(target);

                String temp = strings[i]; //strings[1]= ac
                strings[i] = strings[prevIndex]; //string[1]= string[0] = ab
                strings[prevIndex] = temp; //string[0] = ac

                IndexMap.remove(target);

                i++;

            } else {

                IndexMap.put(target, i);

                i++;
            }

        }


    return strings;
    }
}

