package com.yhojo.tdd

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class KotlinSampleTest {
    @Test
    fun sayHello() {
        assertEquals("Hello, World!!", KotlinSample().hello())
        assertEquals("World", KotlinSample().who)
        assertEquals("Hello, kotlin!!", KotlinSample("kotlin").hello())
        assertEquals("kotlin", KotlinSample("kotlin").who)
    }
}
