package hw2

fun main() {
    println(fibonacciEffectiveWay(100))
    println("Fibonacci number: " + fibonacciNotEffectiveWay(100)) //O(n^2)

}

fun fibonacciEffectiveWay(number: Int): Int {
    var num1 = 1
    var num2 = 1
    print("First $number terms -> ")
    while (num1 <= number) {
        print("$num1+")
        val sum = num1 + num2
        num1 = num2
        num2 = sum
    }
    return num1
}

fun fibonacciNotEffectiveWay(number: Int): Int {
    return if (number <= 1)
        number
    else {
        fibonacciNotEffectiveWay(number - 1) + fibonacciNotEffectiveWay(number - 2)
    }


}