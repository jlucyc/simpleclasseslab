import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(0, 1, 2 ,3, 4);

    }

    @Test
    public void checkAddNumbers(){
        assertEquals(2, calculator.addNumbers(0, 2));
    }

    @Test
    public void checkSubtractNumbers(){
        assertEquals(1, calculator.subtractNumber(3, 2));
    }

    @Test
    public void checkMultiplyNumbers(){
        assertEquals(6, calculator.multiplyNumbers(2, 3));
    }

    @Test
    public void checkDivideNumbers(){
        assertEquals(2.5, calculator.divideNumbers(5, 2), 0.01);
    }

}
