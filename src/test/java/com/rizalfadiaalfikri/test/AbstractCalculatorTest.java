package com.rizalfadiaalfikri.test;

import com.rizalfadiaalfikri.test.reseolver.RandomParameterResolver;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})
public class AbstractCalculatorTest {
    protected Calculator calculator = new Calculator();
}
