package com.devilmcry.ep2

data class ComplexNumber(val real: Float, val imaginary: Float) // 加data, 自动生成 equals()、toString() 等方法

//fun adder(d1: ComplexNumber, d2: ComplexNumber) {
//    var sum = ComplexNumber(1.0f, 1.0f)
//    sum.real = d1.real + d2.real
//    sum.imaginary = d1.imaginary + d2.imaginary
//    return sum
//}

fun adder(d1: ComplexNumber, d2: ComplexNumber) =
    ComplexNumber(d1.real + d2.real, d1.imaginary + d2.imaginary)

fun main() {
    // 测试用例
    val c1 = ComplexNumber(1.5f, 2.5f)
    val c2 = ComplexNumber(3.5f, 4.5f)
    val sum = adder(c1, c2)

    // 输出结果：ComplexNumber(real=5.0, imaginary=7.0)
    println("Sum: $sum")
}