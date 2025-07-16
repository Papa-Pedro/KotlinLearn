package stepic.lessonFour

class LessonFour {

    init {
        println(
            """
            Choose chapter
            1 - Conditional operation
            2 - Logical Operation
        """.trimIndent()
        )
        when(readln()) {
            "1" -> ConditionalOperation()
            "2" -> LogicalOperation()
            else -> print("You pressed the wrong button, bye!")
        }
    }
}