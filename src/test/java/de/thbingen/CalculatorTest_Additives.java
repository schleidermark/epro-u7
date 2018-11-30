package de.thbingen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BaseConfig.class})
public class CalculatorTest_Additives {

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
}