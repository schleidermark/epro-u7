package de.thbingen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest_Mock {

    @Spy
    private Addition addition;

    @Spy
    private Subtraction subtraction;

    @Spy
    private Multiplication multiplication;

    @Spy
    private Division division;


    @InjectMocks
    private Calculator calc;

    @Test
    public void add() {
        calc.setVal(3);
        calc.add(5);

        assertEquals(8d, calc.getVal(), 0);
        verify(addition, atLeastOnce()).calc(3, 5);
    }

    @Test
    public void sub() {
        calc.setVal(3);
        calc.sub(5);

        assertEquals(-2d, calc.getVal(), 0);
        verify(subtraction, atLeastOnce()).calc(3, 5);
    }

    @Test
    public void mul() {
        when(multiplication.calc(10, 0)).thenReturn(42d);

        calc.setVal(10);
        calc.mul(0);

        assertEquals(42d, calc.getVal(), 0);
        verify(multiplication, atLeastOnce()).calc(10, 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void div() {
        when(division.calc(1, 0)).thenThrow(new UnsupportedOperationException("Called 1/0"));
        calc.setVal(1);
        calc.div(0);

        assertEquals((3d / 5), calc.getVal(), 0);     //not reached
    }


}