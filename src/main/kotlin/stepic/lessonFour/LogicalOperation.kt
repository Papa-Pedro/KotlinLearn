package stepic.lessonFour

class LogicalOperation {
    init {
        println("""
            Choose issue:
            1 - Three-digital number
            2 - Belong
        """.trimIndent())
        when (readln()){
            "1" -> cheekCountNumberOfThree()
            "2" -> checkBelongInterval()
            else -> println("You pressed the wrong button, bye!");
        }
    }

    /**
     * Check number have three-digital or not
     * if true print YES
     * else print NO
     */
    private fun cheekCountNumberOfThree() {
        val number = readln().toInt()
        if (number in 100..999) println("YES")
        else println("NO")
    }

    /**
     * Check belong (-1 .. 17)
     * if belong print Принадлежит
     * else print Не принадлежит
     */
    private fun checkBelongInterval() {
        val dot = readln().toInt()
        if (dot in 0..16) println("Принадлежит")
        else println("Не принадлежит")
    }
}