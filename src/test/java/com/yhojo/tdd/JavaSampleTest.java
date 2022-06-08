package com.yhojo.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaSampleTest {
    @Test
    public void sayHello() {
        assertEquals("Hello, World!!", new JavaSample().hello());
        assertEquals("Hello, Java!!", new JavaSample("Java").hello());
    }
}