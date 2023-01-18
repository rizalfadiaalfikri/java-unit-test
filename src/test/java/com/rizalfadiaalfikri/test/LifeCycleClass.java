package com.rizalfadiaalfikri.test;

import org.junit.jupiter.api.Test;

public class LifeCycleClass {

    private String temp;

    @Test
    public void testA() {

        temp = "Rizal Fadia Al Fikri";
    }

    @Test
    public void testB() {
        System.out.println(temp);
    }
}
