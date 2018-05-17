package com.thtun

import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {
    @Test
    fun testSayHello() {
        assertEquals("Hello Kotlin!", sayHello("Kotlin"))
    }
}