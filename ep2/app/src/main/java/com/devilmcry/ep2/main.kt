package com.devilmcry.ep2

fun main() {
//    val d1 = 10
//    val d2 = 10f
//    val d3: Double = 10.0
//    val d4 = true
//    val d5 = "Chars $d1, ${d2.times(d3)}"
//    println("d1 = $d1, d2 = $d2, d3 = $d3, d4 = $d4, d5 = $d5")
//
//    val name = "Lily" //String
//    println("Hello $name !") // 字符串模板表达式(自动替换变量值)
//
//    val a = 10 //int
//    println("a = $a")
//
////    a = 20  //val是不可变类型，会报错
//
//    var b = 10f //float
//    println("b = $b") //var是可变类型
////    b = 20  //此处不能将int的值赋给float变量
////    println("b = $b")
//
//    println("${0..10}")   // .. 包含最后一位
//    println("${0 until 10}") // until不包含最后一位
//
//    val friends = listOf("Tom", "Tom", "Lily")  // List：允许重复，有序
//    val fruits = setOf("apple", "banana", "orange", "apple")    // Set：自动去重，无序
//    val prices = mapOf("apple" to 1, "banana" to 2, "orange" to 3.0)    // Map：键值对，值类型可混合
//    println(friends)
//    println(fruits)
//    println(prices)


    val scores = {
        val l = ArrayList<Course>()
        l.add(Course("Math", 90f))
        l.add(Course("Chinese", 80f))
        l.add(Course("English", 95f))
        l
    }
    val p = Student(name = "Tom", age = 20, gender = "male", sno = 2021010203,
        major = "Intelligent Medical Engineering", grade = 2021,
        scores = scores())
    p.printBasicInfo()
    p.printScores()
}