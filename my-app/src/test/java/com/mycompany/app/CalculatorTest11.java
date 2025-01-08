package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.mycompany.app.Calculator;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest11
{

    private Calculator calculator = new Calculator();

    @Test
    public void shouldAddTwoNumbers()
    {
        assertEquals( calculator.add(1,2), 3 );
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        assertEquals( calculator.subtract(2,1), 1 );
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        assertEquals( calculator.multiply(2,2), 4);
    }
}
