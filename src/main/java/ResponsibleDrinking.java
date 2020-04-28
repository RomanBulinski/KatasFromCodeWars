import java.util.Arrays;

public class ResponsibleDrinking {

    public String hydrate(String drinkString) {
        Integer glassesNumber = Arrays.asList(drinkString.split(" "))
                .stream()
                .filter(x -> x.matches("-?\\d+(\\.\\d+)?"))
                .mapToInt(Integer::valueOf)
                .sum();
        return glassesNumber.equals(new Integer(1)) ? "1 glass of water" : glassesNumber + " glasses of water";
    }


}
