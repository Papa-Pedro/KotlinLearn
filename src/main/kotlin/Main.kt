import stepic.IssueFromStepic


fun main() {
    print("""
        Какой урок вы хотите запустить?
        1. Пузырьковую сортировку
        3. Третий урок
        
    """.trimIndent())
    when(readln()) {
        /**
         * Пузырьковая сортировка по возрастанию
         * Сравниваем элементы, большый помещяем в лево, проходим по массиву так n раз.
         */
        "1" -> {
            val bubbleSort = BubbleSort();
            bubbleSort.sortingArray()
        }
        else -> choseChapterLessonThree();
    }
}

fun choseChapterLessonThree() {
    val issueFromStepic = IssueFromStepic();
    when(readln()) {
        "4" -> issueFromStepic.lessonThree.solveTask3dot4()
        "5" -> issueFromStepic.lessonThree.solveTask3dot5()
        "6" -> issueFromStepic.lessonThree.solveTaskThreeDotSix();
        else -> issueFromStepic.lessonThree.solveTaskThreeDotSeven()
    }
}

