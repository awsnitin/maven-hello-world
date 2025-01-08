package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.mycompany.app.Calculator;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest12
{

    private Calculator calculator = new Calculator();

    @Test
    public void shouldAddTwoNumbers1()
    {
        assertEquals( calculator.add(1,2), 3 );
    }

    @Test
    public void shouldSubtractTwoNumbers1() {
        assertEquals( calculator.subtract(2,1), 1 );
    }

    @Test
    public void shouldMultiplyTwoNumbers1() {
        assertEquals( calculator.multiply(2,2), 5);
    }
}
