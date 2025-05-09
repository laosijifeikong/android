package com.devilmcry.ep2

class Student (
    name: String,
    age: Int,
    gender: String,

    val sno: Int,
    val major: String,
    val grade: Int,
    val scores: ArrayList<Course>

) : Person(name, age, gender), PrintInfo {


    /**
     * Student name: Tom
     * Age: 20
     * Gender: male
     * Major: Intelligent Medical Engineering
     * Grade: 2021
     */
    override fun printBasicInfo(){
        println("Student name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Major: $major")
        println("Grade: $grade")
    }

    override fun printScores(){
        if (scores.isEmpty()) {
            return
        }
        scores.forEach { course ->
            println("${course.title}: ${course.score}")
        }
    }
}