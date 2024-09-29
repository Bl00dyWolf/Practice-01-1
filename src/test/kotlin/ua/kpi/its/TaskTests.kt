package ua.kpi.its

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse
import kotlin.test.assertNull

class TaskTests {

    // Test 1: Check if a number is even or odd
    @Test
    fun testCheckEvenOrOdd() {
        assertEquals("even", checkEvenOrOdd(2))
        assertEquals("odd", checkEvenOrOdd(3))
        assertEquals("", checkEvenOrOdd())
    }

    // Test 2: Sum of the first five prime numbers
    @Test
    fun testSumOfFirstFivePrimes() {
        assertEquals(28, sumOfFirstFivePrimes()) // 2 + 3 + 5 + 7 + 11 = 28
    }

    // Test 3: Sum of a series of numbers made up of ones
    @Test
    fun testSumOfOnesSeries() {
        assertEquals(12345, sumOfOnesSeries(5)) // 1 + 11 + 111 + 1111 + 11111 = 12345
    }

    // Test 4: Fibonacci sequence
    @Test
    fun testFibonacci() {
        assertEquals(0, fibonacci(0))
        assertEquals(1, fibonacci(1))
        assertEquals(5, fibonacci(5))
    }

    // Test 5: Reverse a string
    @Test
    fun testReverseString() {
        assertEquals("niltok", reverseString("kotlin"))
    }

    // Test 6: Factorial of a number
    @Test
    fun testFactorial() {
        assertEquals(120, factorial(5)) // 5 * 4 * 3 * 2 * 1 = 120
    }

    // Test 7: Frequency analysis of a string
    @Test
    fun testFrequencyAnalysis() {
        assertEquals(mapOf('k' to 1, 'o' to 1, 't' to 1, 'l' to 1, 'i' to 1, 'n' to 1), frequencyAnalysis("kotlin"))
    }

    // Test 8: Find the minimum element in a list
    @Test
    fun testFindMinimum() {
        assertEquals(1, findMinimum(listOf(3, 1, 4, 1, 5, 9)))
        assertNull(findMinimum(emptyList()))
    }

    // Test 9: Check if a string is a palindrome
    @Test
    fun testIsPalindrome() {
        assertTrue(isPalindrome("radar"))
        assertFalse(isPalindrome("kotlin"))
    }

    // Test 10: Caesar cipher
    @Test
    fun testCaesarCipher() {
        assertEquals("cde", caesarCipher("abc", 2))
    }
}
