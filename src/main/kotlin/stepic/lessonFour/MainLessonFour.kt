package stepic.lessonFour

class LessonFour {

    init {
        println(
            """
            Choose chapter
            1 - Conditional operation
            2 - Logical Operation
            3 - Nested Operation
        """.trimIndent()
        )
        when(readln()) {
            "1" -> ConditionalOperation()
            "2" -> LogicalOperation()
            "3" -> NestedCondition()
            else -> print("You pressed the wrong button, bye!")
        }
    }
}