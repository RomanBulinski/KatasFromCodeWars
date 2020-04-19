import java.util.*;

import static java.util.stream.Collectors.toList;

public class ManyLanguages {

    public static List<String> myLanguages(final Map<String, Integer> results) {

        List<String> languageList = new ArrayList<>();
        Set<String> languages = results.keySet();
        Collection<Integer> valuesForLanguages = results.values();
        List<Integer> cue = valuesForLanguages.stream().filter(x -> x >= 60).sorted(Collections.reverseOrder()).collect(toList());
        for (Integer s : cue) {
            for ( String  str :languages  ) {
                if( s.equals( results.get( str )   )   ){
                    languageList.add(str);
                }
            }
        }
        return languageList;
    }


}
