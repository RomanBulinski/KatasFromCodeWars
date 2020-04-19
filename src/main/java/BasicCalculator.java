public class BasicCalculator {

    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        Double result = null;

        switch (operation) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                if ( numberOne == 0D || numberTwo == 0D) {
                    result = 0D;
                } else {
                    result = numberOne * numberTwo;
                }
                break;
            case "/":
                if (numberTwo == 0) {
                    result = null;
                    break;
                }
                result = numberOne / numberTwo;
                break;
            default:
        }
        return result;

    }
}
