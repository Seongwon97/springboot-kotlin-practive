package com.group.calculator

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class CalculatorTest {

    @Test
    fun addTest() {
        val calculator = Calculator(5)

        calculator.add(3)

        assertThat(calculator.number).isEqualTo(8)
    }

    @Test
    fun minusTest() {
        val calculator = Calculator(5)

        calculator.minus(3)

        assertThat(calculator.number).isEqualTo(2)
    }

    @Test
    fun multiplyTest() {
        val calculator = Calculator(5)

        calculator.multiply(3)

        assertThat(calculator.number).isEqualTo(15)
    }

    @Test
    fun divideTest() {
        val calculator = Calculator(6)

        calculator.divide(3)

        assertThat(calculator.number).isEqualTo(2)
    }

    @Test
    fun divideExceptionTest1() {
        val calculator = Calculator(6)

        val message = assertThrows<IllegalArgumentException> {
            calculator.divide(0)
        }.message
        assertThat(message).isEqualTo("0으로 나눌 수 없습니다.")
    }

    @Test
    fun divideExceptionTest2() {
        val calculator = Calculator(6)

        assertThrows<IllegalArgumentException> {
            calculator.divide(0)
        }.apply {
            assertThat(message).isEqualTo("0으로 나눌 수 없습니다.")
        }
    }
}
