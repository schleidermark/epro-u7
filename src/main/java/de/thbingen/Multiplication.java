package de.thbingen;

import org.springframework.stereotype.Component;

/**
 * Bean for addition
 */
@Component
public class Multiplication implements ArethmeticOperation {

    @Override
    public double calc(double a, double b) {
        return a * b;
    }
}
