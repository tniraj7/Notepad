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

        course = CourseInfo(courseId = "Java Fundamentals: The Java Language", title = "Java_Lang")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java_Core", courseId = "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }
}