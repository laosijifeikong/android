package com.devilmcry.ep2

open class Person (
    val name: String,
    val age: Int
)
{
    var gender: String = "unknown"

    constructor(name: String, age: Int, gender: String) : this(name, age){
        this.gender = gender
        checkGender()
    }

    private fun checkGender() {
        if (gender.lowercase() !in listOf("female", "male")){
            println("Gender must be 'female' or 'male'")
        }
//        else{
//            println("Gender is $gender")
//        }
    }
}

fun main() {
    val p1 = Person("Lily", 22, "female")  // 合法
    val p2 = Person("Tom", 25, "Male")     // 输出校验提示（自动转小写后通过）
    val p3 = Person("Bob", 30, "unknown")  // 输出校验提示
}