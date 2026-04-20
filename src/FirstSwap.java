
import java.util.*;

public class FirstSwap {
    public static void main(String[] args) {


        String[] input = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};

        System.out.println(java.util.Arrays.toString(firstSwap(input)));


    }
    public static String[] firstSwap(String[] strings) {

        Map<String, Integer> IndexMap = new HashMap<>();

        Set<String> disabled = new HashSet<>();

        int i = 0;

        for (String x : strings) {

            String target = x.substring(0, 1);

            if (IndexMap.containsKey(target) && !(disabled.contains(target)) ) {

                int prevIndex = IndexMap.get(target);
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;

                disabled.add(target);

                i++;

            } else {

                IndexMap.put(target, i);

                i++;
            }

        }


        return strings;
    }


}
