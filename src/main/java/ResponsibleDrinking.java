

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ResponsibleDrinking {


//    "1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"

    public String hydrate(String drinkString) {
        Integer glassesNumber = Arrays.asList( drinkString.split(" ") )
                .stream()
                .filter( x -> x.matches("-?\\d+(\\.\\d+)?") )
                .mapToInt(Integer::valueOf)
                .sum();
        return glassesNumber.equals( new Integer(1))? "1 glass of water" : glassesNumber + " glasses of water";
    }



}
