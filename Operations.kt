package com.example.calculator

import java.math.BigDecimal

class Operations {

    companion object {

        fun add (firstNum : String, secNum : String) : String {
            var sum = ""
            var result : BigDecimal

            var a : BigDecimal = firstNum.toBigDecimal()
            var b : BigDecimal = secNum.toBigDecimal()

            result = a + b
            sum = result.toString()

            return sum
        }

        fun subtract (firstNum : String, secNum : String) : String {
            var sum = ""
            var result : BigDecimal

            var a : BigDecimal = firstNum.toBigDecimal()
            var b : BigDecimal = secNum.toBigDecimal()

            result = a - b
            sum = result.toString()

            return sum
        }

        fun multiply (firstNum : String, secNum : String) : String {
            var sum = ""
            var result : BigDecimal

            var a : BigDecimal = firstNum.toBigDecimal()
            var b : BigDecimal = secNum.toBigDecimal()

            result = a * b
            sum = result.toString()

            return sum
        }

        fun divide (firstNum : String, secNum : String) : String {
            var sum = ""
            var result : BigDecimal

            var a : BigDecimal = firstNum.toBigDecimal()
            var b : BigDecimal = secNum.toBigDecimal()

            result = a / b
            sum = result.toString()

            return sum
        }

        fun percentage (firstNum : String, secNum : String) : String {
            var sum = ""
            var result = 0.0

            var a : BigDecimal = firstNum.toBigDecimal()
            var b : BigDecimal = secNum.toBigDecimal()

            result = a.toDouble() * (b.toDouble() / 100)
            sum = result.toString()

            return sum
        }

    }
}