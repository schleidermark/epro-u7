package de.thbingen;

import org.springframework.stereotype.Component;

/**
 * Bean for subtraction
 */
@Component
public class Subtraction implements ArethmeticOperation{
    @Override
    public double calc(double a, double b) {
        return a - b;
    }
}
