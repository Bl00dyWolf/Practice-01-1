package ua.kpi.its

// Task 1: Check if a number is even or odd
fun checkEvenOrOdd(input: Int? = null): String {
    return when {
        input == null -> ""
        input % 2 == 0 -> "even"
        else -> "odd"
    }
}

// Task 2: Sum of the first five prime numbers
fun sumOfFirstFivePrimes(): Int {
    val numbers = mutableListOf<Int>()
    var num = 2
    while (numbers.size < 5) {
        if (isPrime(num)) {
            numbers.add(num)
        }
        num++
    }
    return numbers.sum()
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

// Task 3: Sum of a series of numbers made up of ones
fun sumOfOnesSeries(n: Int): Int {
    var sum = 0
    var currentNumber = 0
    for (i in 1..n) {
        currentNumber = currentNumber * 10 + 1
        sum += currentNumber
    }
    return sum
}

// Task 4: Fibonacci sequence
fun fibonacci(n: Int): Int {
    if (n <= 1) return n
    var a = 0
    var b = 1
    var c = 0
    for (i in 2..n) {
        c = a + b
        a = b
        b = c
    }
    return c
}

// Task 5: Reverse a string
fun reverseString(input: String): String {
    return input.reversed()
}

// Task 6: Factorial of a number
fun factorial(n: Int): Int {
    return if (n == 0) 1 else n * factorial(n - 1)
}

// Task 7: Frequency analysis of a string
fun frequencyAnalysis(input: String): Map<Char, Int> {
    return input.groupingBy { it }.eachCount()
}

// Task 8: Find the minimum element in a list
fun findMinimum(numbers: List<Int>): Int? {
    return numbers.minOrNull()
}

// Task 9: Check if a string is a palindrome
fun isPalindrome(input: String): Boolean {
    return input == input.reversed()
}

// Task 10: Caesar cipher
fun caesarCipher(input: String, shift: Int): String {
    val result = StringBuilder()
    for (char in input) {
        if (char.isLetter()) {
            val base = if (char.isUpperCase()) 'A' else 'a'
            result.append(((char - base + shift) % 26 + base.toInt()).toChar())
        } else {
            result.append(char)
        }
    }
    return result.toString()
}
