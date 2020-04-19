import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

public class BasicCalculatorTest {

    @Test
    public void BasicTest() {
        assertEquals("3.2 + 8 = 11.2",new Double(11.2),BasicCalculator.calculate(3.2,"+", 8));
        assertEquals("3.2 - 8 = -4.8",new Double(-4.8),BasicCalculator.calculate(3.2,"-", 8));
        assertEquals("3.2 / 8 = .4",new Double(0.4),BasicCalculator.calculate(3.2,"/", 8));
        assertEquals("3.2 * 8 = 25.6",new Double(25.6),BasicCalculator.calculate(3.2,"*", 8));
        assertEquals("-3 + 0 = -3",new Double(-3),BasicCalculator.calculate(-3,"+", 0));
        assertEquals("-3 - 0 = -3",new Double(-3),BasicCalculator.calculate(-3,"-", 0));
        assertEquals("-3 / 0 = null",null,BasicCalculator.calculate(-3,"/", 0));
        assertEquals("-2 / -2 = 1",new Double(1),BasicCalculator.calculate(-2, "/", -2));
        assertEquals("-3 * 0 = 0",new Double(0),BasicCalculator.calculate(-3,"*", 0));
        assertEquals("-3 w 0 = null",null,BasicCalculator.calculate(-3,"w", 0));
    }

}
