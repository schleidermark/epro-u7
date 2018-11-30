package de.thbingen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BaseConfig.class})
public class CalculatorTest_Multiplicatives {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void mul() {
        Calculator calc = (Calculator) ctx.getBean("calculator");
        calc.setVal(3);
        calc.mul(5);

//        assertEquals(15d, calc.getVal(), 0);
        double delta = 0d;
        assertTrue(calc.getVal() <= 15d + delta && calc.getVal() >= 15 - delta);
    }

    @Test
    public void div() {
        Calculator calc = (Calculator) ctx.getBean("calculator");
        calc.setVal(3);
        calc.div(5);

//        assertEquals((3d / 5), calc.getVal(), 0);
        double delta = 0d;
        assertTrue(calc.getVal() <= (3d/5) + delta && calc.getVal() >= (3d/5) - delta);
    }
}
