package de.thbingen;

import de.thbingen.BaseConfig;
import de.thbingen.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BaseConfig.class})
public class CalculatorTest {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void add() {
        Calculator calc = (Calculator) ctx.getBean("calculator");
        calc.setVal(3);
        calc.add(5);

        assertEquals(8d, calc.getVal(), 0);
    }

    @Test
    public void sub() {
        Calculator calc = (Calculator) ctx.getBean("calculator");
        calc.setVal(3);
        calc.sub(5);

        assertEquals(-2d, calc.getVal(), 0);
    }

    @Test
    public void mul() {
        Calculator calc = (Calculator) ctx.getBean("calculator");
        calc.setVal(3);
        calc.mul(5);

        assertEquals(15d, calc.getVal(), 0);
    }

    @Test
    public void div() {
        Calculator calc = (Calculator) ctx.getBean("calculator");
        calc.setVal(3);
        calc.div(5);

        assertEquals((3d / 5), calc.getVal(), 0);
    }

    @Test
    public void pow() {
        Calculator calc = (Calculator) ctx.getBean("calculator");
        calc.setVal(3);
        calc.pow(5);

        assertEquals((3 * 3 * 3 * 3 * 3d), calc.getVal(), 0);
    }

    @Test
    public void root() {
        Calculator calc = (Calculator) ctx.getBean("calculator");
        calc.setVal(3 * 3 * 3 * 3 * 3);
        calc.root(5);

        assertEquals(3d, calc.getVal(), 0);
    }
}