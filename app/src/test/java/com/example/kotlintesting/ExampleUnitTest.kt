package com.example.kotlintesting

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun multiplyTest() {
        val sum = Multiply()
        val result = sum.multiplyTwoNumbers(1, 2)
        assertEquals(2, result)
    }
}