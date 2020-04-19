public class BasicCalculator {

    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        switch (operation) {
            case "+": return numberOne + numberTwo;
            case "-": return numberOne - numberTwo;
            case "*": return numberOne == 0D || numberTwo == 0D ? 0D : numberOne * numberTwo;
            case "/": return numberTwo == 0 ?  null : numberOne / numberTwo;
        }
        return null;
    }
}
