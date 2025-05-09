package com.devilmcry.ep2

data class Course(
    val title: String,         // 课程名称（不可变）
    val score: Float = 0.0f    // 课程分数（默认值0.0，不可变）
) {
}