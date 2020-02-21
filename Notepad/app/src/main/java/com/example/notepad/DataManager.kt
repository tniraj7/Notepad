package com.example.notepad

object DataManager {
    val courses = HashMap<String, CourseInfo>()

    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("Android_Intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo("Android_Async", "Andrdoid Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "Java_Lang", title = "Java Fundamentals: The Java Language")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Core: The Core Platform", courseId = "Java_Core")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes() {

        var course = courses["Android_Intents"]!!
        var note = NoteInfo(course, "Dynamic intent resolution",
            "Wow, intents allow components to be resolved at runtime")
        notes.add(note)


        course = courses["Android_Async"]!!
        note = NoteInfo(course, "Service default threads",
            "Did you know that by default an Android Service will tie up the UI thread?")
        notes.add(note)


        course = courses["Java_Lang"]!!
        note = NoteInfo(course, "Parameters",
            "Leverage variable-length parameter lists")
        notes.add(note)


        course = courses["Java_Core"]!!
        note = NoteInfo(course, "Compiler options",
            "The -jar option isn't compatible with with the -cp option")
        notes.add(note)

    }
}