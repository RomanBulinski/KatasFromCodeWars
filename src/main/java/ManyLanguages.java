import java.util.*;

import static java.util.stream.Collectors.toList;

public class ManyLanguages {

    public static List<String> myLanguages(final Map<String, Integer> results) {

        List<String> queue = results.values()
                .stream()
                .filter(x -> x >= 60)
                .sorted(Collections.reverseOrder())
                .map(y -> change(y, results))
                .collect(toList());

        return queue;
    }

    private static String change(Integer i, Map<String, Integer> results) {
        String res = null;
        Set<String> languages = results.keySet();
        for (String str : languages) {
            if (i.equals(results.get(str))) {
                res = str;
            }
        }
        return res;
    }


}
