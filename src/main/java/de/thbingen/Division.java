package de.thbingen;

import org.springframework.stereotype.Component;

/**
 * Bean for division
 */
@Component
public class Division implements ArethmeticOperation {

    @Override
    public double calc(double a, double b) {
        return a / b;
    }
}
