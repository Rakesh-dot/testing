package com.kiran.testingkotlinapp

import org.junit.Assert
import org.junit.Test

class myTest {
    private lateinit var arithmetic: Arithmetic
    // Test addition
    @Test
    fun testAddition() {
        val expectedValue = 4
        arithmetic = Arithmetic()
        arithmetic.first = 2
        arithmetic.second = 2
        val actualValue = arithmetic.add()
        Assert.assertEquals(expectedValue, actualValue)
    }
    @Test
    fun testSubtraction() {
        val expectedValue = 0
        arithmetic = Arithmetic()
        arithmetic.first = 2
        arithmetic.second = 2
        val actualValue = arithmetic.subtract()
        Assert.assertEquals(expectedValue, actualValue)
    }
}