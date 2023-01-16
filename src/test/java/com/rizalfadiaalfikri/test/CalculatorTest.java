package com.rizalfadiaalfikri.test;

import com.rizalfadiaalfikri.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//@DisplayName("Test untuk Calculator class")
//@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @DisplayName("test skenario untuk method add(integer, integer")
    @Test
    public void testAddSuccess() {
        var result = calculator.add(10, 10);
        assertEquals(20, result);
    }

    @Test
    public void testDivideSuccess() {
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    @Test
    public void testDivideFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
           calculator.divide(10, 0);
        });
    }

    @Test
    @Disabled
    public void testComingSoon() {

    }

}
