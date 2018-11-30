package de.thbingen;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorTest_Additives.class, CalculatorTest_Multiplicatives.class, CalculatorTest_Potencies.class})
public class CalculatorTest_Suit {
}
