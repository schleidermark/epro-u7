package de.thbingen;

import de.thbingen.MyCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyCalculatorTest {

    @Test
    public void add() {
        MyCalculator calc = new MyCalculator(3);
        calc.add(5);

        assertEquals(8d, calc.getVal(), 0);
    }

    @Test
    public void sub() {
        MyCalculator calc = new MyCalculator(3);
        calc.sub(5);

        assertEquals(-2d, calc.getVal(), 0);
    }

    @Test
    public void mul() {
        MyCalculator calc = new MyCalculator(3);
        calc.mul(5);

        assertEquals(15d, calc.getVal(), 0);
    }

    @Test
    public void div() {
        MyCalculator calc = new MyCalculator(3);
        calc.div(5);

        assertEquals((3d/5), calc.getVal(), 0);
    }
}