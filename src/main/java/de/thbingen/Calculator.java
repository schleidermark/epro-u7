package de.thbingen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The Calculator bean
 */
@Component
public class Calculator {
    private double val;

    private Addition addition;
    private Subtraction subtraction;
    private Multiplication multiplication;
    private Division division;
    private Power power;
    private Root root;

    @Autowired
    public Calculator(Addition addition, Subtraction subtraction, Multiplication multiplication, Division division, Power power, Root root) {
        this.addition = addition;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
        this.power = power;
        this.root = root;
    }

    public void add(double d) {
        val = addition.calc(val, d);
    }

    public void sub(double d) {
        val = subtraction.calc(val, d);
    }

    public void mul(double d) {
        val = multiplication.calc(val, d);
    }

    public void div(double d) {
        val = division.calc(val, d);
    }

    public void pow(double d){
        val = power.calc(val, d);
    }

    public void root(double d){
        val = root.calc(val, d);
    }


    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }
}
