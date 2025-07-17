package stepic.lessonFour

class LogicalOperation {
    init {
        println("""
            Choose issue:
            1 - Three-digital number
            2 - Belong
            3 - Belong 2
            4 - Digit of number
            5 - Lucking ticket
        """.trimIndent())
        when (readln()){
            "1" -> cheekCountNumberOfThree()
            "2" -> checkBelongCloserInterval()
            "3" -> checkBelongOpenInterval()
            "4" -> checkDigitOnDifferent()
            "5" -> defineTicketWasLucking()
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
    private fun checkBelongCloserInterval() {
        val dot = readln().toInt()
        if (dot in 0..16) println("Принадлежит")
        else println("Не принадлежит")
    }

    /** Check belong interval
     * less -3 and above 7
     * if is it true print - "Принадлежит"
     * else print - "Не принадлежит"
     */
    private fun checkBelongOpenInterval() {
        val x = readln().toInt()
        if (x < -2 || x > 6) println("Принадлежит")
        else println("Не принадлежит")
    }

    /** Need know all digit was different
     * input - natural number of 3-digit
     * print "YES" if all digit was different
     * else - "NO"
     * */
    private fun checkDigitOnDifferent() {
//        println(
//            if (readln().toSet().size == 3) "YES" else "NO"
//        )
        val number = readln();
        var set = mutableSetOf<Char>()
        for (element in number) {
            set.add(element)
        }
        println(if (set.size == 3) "YES" else "NO")

    }

    /**
     * Need define have ticket as lucking or no
     * print "YES" - have
     * "NO" - haven't
     * @param - input: 6 digital number
     */
    private fun defineTicketWasLucking(){
        //с помошью метода map получает List сосотоящий из char к которому применено digitalToInt
        val digital = readln().map(Char::digitToInt)
        val firstSum = digital.take(3).sum()
        val secondSum = digital.drop(3).sum()
        println(if (firstSum == secondSum ) "YES" else "NO")
    }

}