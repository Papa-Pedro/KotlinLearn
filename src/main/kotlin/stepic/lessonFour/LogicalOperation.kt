package stepic.lessonFour
import kotlin.math.abs

class LogicalOperation {
    init {
        println("""
            Choose issue:
            1 - Three-digital number
            2 - Belong
            3 - Belong 2
            4 - Digit of number
            5 - Lucking ticket
            6 - Leap year
            7 - Age group
            8 - Rook
            9 - Bishop
        """.trimIndent())
        when (readln()){
            "1" -> cheekCountNumberOfThree()
            "2" -> checkBelongCloserInterval()
            "3" -> checkBelongOpenInterval()
            "4" -> checkDigitOnDifferent()
            "5" -> defineTicketWasLucking()
            "6" -> defineLeapYear()
            "7" -> defineAgeGroup()
            "8" -> beatOfRook()
            "9" -> beatOfBishop()
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
        //с помошью метода map получает List сосотоящий из char  которому применено digitalToInt
        val digital = readln().map(Char::digitToInt)
        val firstSum = digital.take(3).sum()
        val secondSum = digital.drop(3).sum()
        println(if (firstSum == secondSum ) "YES" else "NO")
    }

    /**
     * Define have year leap
     * Year have leap if divide on
     * 4, not 100 or 400
     * if yes print - "YES"
     * else - "NO"
     * @param - number
     */
    private fun defineLeapYear() {
        val year = readln().toInt()
        if ( (year % 4 == 0 || year % 400 == 0) && (year % 100 != 0) ) {
            println("YES")
        }
        else {
            println("NO")
        }
    }

    /**
     * Define which group does he belong
     * until 13 include print - "детство"
     * 14-24 include print - "молодость"
     * 25-59 include print - "зрелость"
     * from 60 print - "старость"
     */
    private fun defineAgeGroup() {
        println(
            when (val age = readln().toInt()) {
                in 0..13 -> "детство"
                in 14..24 -> "молодость"
                in 25..59 -> "зрелость"
                else -> "старость"
            }
        )
    }

    /**
     * Define beat rook figure or not
     * firstly read coordinate Rook (coordinateRook), after coordinate (coordinateFigure)
     * print "YES" once coordinate match
     * else "NO"
     */
    private fun beatOfRook(){
        val (rookColumn, rookRow) = List(2) { readln().toInt()}
        val (figureColumn, figureRow) = List(2) { readln().toInt()}
        println(
            if (rookColumn == figureColumn || rookRow == figureRow) "YES"
            else "NO"
        )
    }

    /** Define beat bishop figure or not
     * if definition between the coordinate bishop (bishopColumn, bishopRow)
     * and figure (figureColumn, figureRow) equal print "YES"
     * else "NO"
     */
    private  fun beatOfBishop(){
        val (bishopColumn, bishopRow) = List(2) { readln().toInt() }
        val (figureColumn, figureRow) = List(2) { readln().toInt() }
        println(
            if (abs(bishopColumn - figureColumn) == abs(bishopRow - figureRow )) "YES"
            else "NO"
        )
    }
}