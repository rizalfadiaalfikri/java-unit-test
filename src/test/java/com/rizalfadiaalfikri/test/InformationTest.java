package com.rizalfadiaalfikri.test;

import org.junit.jupiter.api.*;

@DisplayName("information test")
public class InformationTest {

    @Test
    @Tags({
            @Tag("one"),
            @Tag("two")
    })
    @DisplayName("this is test 1")
    void test1(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestClass().orElse(null));
        System.out.println(testInfo.getTestMethod().orElse(null));
    }

}
