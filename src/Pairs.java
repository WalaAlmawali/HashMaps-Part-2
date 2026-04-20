import java.util.*;

public class Pairs {
    public static void main(String[] args) {

        String[] pairs = {"code", "bug"};
        Map<String, String> result = new HashMap<>();

        for (String pair : pairs) {

            String firstChar = pair.substring(0,1);
            String lastChar = pair.substring(pair.length() - 1);

            result.put(firstChar, lastChar);


        }

        System.out.println(result);

    }

    }
