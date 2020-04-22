import java.util.Arrays;

public class ResponsibleDrinking {


//    "1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"

    public String hydrate(String drinkString) {

        Long xss = Arrays.asList( drinkString.split(" ") )
                .stream()
                .filter(String::isInstance)
                .map (::cast)
                .filter( x ->  x instanceof Integer )
                .count();
        // Insert party here
        return "";
    }
}
