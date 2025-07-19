import stepic.IssueFromStepic
import stepic.lessonFour.LogicalOperation
import stepic.lessonFour.NestedCondition


fun main() {
    println("""
        Какой урок вы хотите запустить?
        1. Пузырьковую сортировку
        3. Третий урок
        4. Четвертый урок
    """.trimIndent())
    val issueFromStepic = IssueFromStepic();
    when(readln()) {
        /**
         * Пузырьковая сортировка по возрастанию
         * Сравниваем элементы, большый помещяем в лево, проходим по массиву так n раз.
         */
        "1" -> {
            val bubbleSort = BubbleSort();
            bubbleSort.sortingArray()
        }
        "3" -> issueFromStepic.lessonThree
        "4" -> issueFromStepic.lessonFour
        else -> NestedCondition() //println("You pressed the wrong button, bye!");
    }
}

