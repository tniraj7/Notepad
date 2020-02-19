package com.example.notepad

class DataManager {
    val courses = HashMap<String, CourseInfo>()

    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("Android_Intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo("Android_Async", "Andrdoid Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "Java_Lang", title = "Java Fundamentals: The Java Language")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Core Platform", courseId = "Java_Core")
        courses.set(course.courseId, course)
    }
}