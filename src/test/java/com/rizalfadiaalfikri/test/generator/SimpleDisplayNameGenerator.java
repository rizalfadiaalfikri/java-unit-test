package com.rizalfadiaalfikri.test.generator;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

public class SimpleDisplayNameGenerator implements DisplayNameGenerator {
    @Override
    public String generateDisplayNameForClass(Class<?> aClass) {
        return "Test " + aClass.getSimpleName();
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> aClass) {
        return "Test " + aClass.getSimpleName() + "." + aClass.getName();
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> aClass, Method method) {
        return null;
    }
}
