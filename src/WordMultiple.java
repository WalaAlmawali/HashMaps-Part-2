import java.util.*;

public class WordMultiple {
    public static void main(String[] args) {





    }

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Integer> countMap = new HashMap<>();

        for (String str : strings) {

            if (countMap.containsKey(str)) {

                countMap.put(str, countMap.get(str) + 1);
            }else{
                countMap.put(str, 1);
            }


            }


    }





    }



    }


