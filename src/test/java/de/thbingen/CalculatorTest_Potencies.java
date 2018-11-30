package de.thbingen;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BaseConfig.class})
public class CalculatorTest_Potencies {

    @Autowired
    private ApplicationContext ctx;

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
