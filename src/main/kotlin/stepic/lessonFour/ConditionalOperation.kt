package stepic.lessonFour

/**
 * Class for issue at chapter "Conditional operation"
 */
class ConditionalOperation {

    init {
        println(
            """
            Press number for choose:
            1 - Max against two numbers
            2 - Password
            3 - Accesses in BeeGeek
            4 - Even Number
            5 - Divisibility
            6 - Sign number
        """.trimIndent()
        )
        when(readln()){
            "1" -> outputMaxNumber()
            "2" -> checkPasswordAndConfirmation()
            "3" -> checkAccessesInBeeGeek()
            "4" -> checkEvenNumber()
            "5" -> checkDivisionByAnInteger()
            "6" -> calculateSignOfNumber()
            else -> println("You pressed the wrong button, bye!")
        }
    }

    /** Look max number */
    private fun outputMaxNumber() {
        val (firstNumber, secondNumber) = readln().toInt() to readln().toInt()
        if (firstNumber > secondNumber) print(firstNumber)
        else println(secondNumber)
    }

    /** Check password and confirmation
     *  if equal than print inside console "Пароль принят"
     *  if not - print "Пароль не принят"
     */
    private fun checkPasswordAndConfirmation(){
        val (password, confirmation) = readln() to readln()
        if (password == confirmation) println("Пароль принят")
        else println("Пароль не принят")
    }

    /**
     * Check age
     * if age >= 12 print inside console "Доступ разрешен"
     * if not - print "Доступ запрещен"
     */
    private fun checkAccessesInBeeGeek() {
        val age = readln().toInt();
        if (age >= 12) println("Доступ разрешен")
        else println("Доступ запрещен")
    }

    /**
     * Check number was even or not
     * if even print - YES
     * else print - NO
     */
    private fun checkEvenNumber() {
        val number = readln().toInt()
        if (number % 2 == 0) print("YES")
        else print("NO")
    }

    /**
     * Check division by an Integer
     * if division print - YES
     * else print - NO
     */
    private fun checkDivisionByAnInteger() {
        val (a, b) = readln().toInt() to readln().toInt()
        if (a % b == 0) print("YES")
        else print("NO")
    }

    /** Calculate sign of number
     * use formula:
     *  -1 if number < 0
     *  0 if number = 0
     *  1 if number > 0
     */
    private fun calculateSignOfNumber() {
        val x = readln().toInt();
        val sign = when {
            x < 0 -> -1
            x > 0 -> 1
            else -> 0
        }
        print(sign)
    }
}