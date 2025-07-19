package stepic.lessonFour

import java.lang.IllegalStateException
import kotlin.math.min
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt

class NestedCondition {

    init {
        println("""
            Nested condition - it's condition which locate inside another condition
            Issue for nested condition:
            1 - Point affiliation
            2 - Ceremony weigh
            3 - Amount equal among three
            4 - Coordinate quarter 
            5 - Calculate
            6 - Quadratic equation
            7 - Amount day of month
            8 - Time of year
        """.trimIndent())

        when (readln()) {
            "1" -> definePointAffiliation()
            "2" -> defineWeighCategory()
            "3" -> defineAmountEqualNumber()
            "4" -> defineAffiliationQuarter()
            "5" -> calculateTwoNumber()
            "6" -> decideQuadraticEquation()
            "7" -> printAmountDayOfMonth()
            "8" -> defineTimeOfYear()
        }
    }

    /**
     * Define point (x: Int) affiliation segment
     * [-3; 1] and [5; 9]
     * print "YES" if affiliation
     * else "NO"
     */
    private fun definePointAffiliation() {
        val x = readln().toInt()
        println(
            when (x) {
                in -3..1 -> "YES"
                in 5..9 -> "YES"
                else -> "NO"
            }
        )
    }

    /**
     * Define which weigh category boxer
     * if until 60 kg (non-include)  print "Легкий вес"
     * until 64 kg (non-include)  print "Первый полусредний вес"
     * until 69 kg (non-include)  print "Полусредний вес"
     */
    private fun defineWeighCategory() {
        val boxerWeigh = readln().toInt()
        println(
            when (boxerWeigh) {
                in 0 until 60 -> "Легкий вес"
                in 60 until 64 -> "Первый полусредний вес"
                else -> "Полусредний вес"
            }
        )
        }

    /**
     * Define amount equal number
     * print they amount
     */
    private fun defineAmountEqualNumber() {
        val (firstNumber, secondNumber, thirdNumber) = List(3) { readln().toInt()}
        println(
            //используем множества внутри switch (when)
            when(setOf(firstNumber, secondNumber, thirdNumber).size) {
                1 -> 3 //все три равны
                2 -> 2 //только два
                else -> 0 //ниодин
            }
        )


    }

    /**
     * Coordinate quarter
     * Define which quarter affiliation
     * input 2 number (x and y).
     * output number of quarter
     */
    private fun defineAffiliationQuarter() {
        val (x, y) = List(2) { readln().toDouble() > 0 }
        //используем to, через объект Pair(x, y), своего рода упаковка
        println( when (x to y) {
            true  to true  -> 1 // x>0 && y>0
            false to true  -> 2 // x<=0 && y>0
            false to false -> 3 // x<=0 && y<=0
            true  to false -> 4 // x>0 && y<=0
            else -> throw IllegalStateException("Непредвиденная комбинация: x=$x, y=$y")
        }
        )
    }

    /**
     * Calculate
     * input - 2 int number and operation as Sting
     * if sting is mathematics operation then calculate and print result
     * else print «Неверная операция»
     * else division by zero print «На ноль делить нельзя!».
     */
    private fun calculateTwoNumber() {
        val (firstNumber, secondNumber) = List(2) { readln().toInt() }
        println(
            when (readln()) {
                "/" -> if (secondNumber == 0) "На ноль делить нельзя!"
                    else firstNumber.toDouble() / secondNumber
                "*" -> firstNumber * secondNumber
                "+" -> firstNumber + secondNumber
                "-" -> firstNumber - secondNumber
                else -> "Неверная операция"
            }
        )
    }

    /**
     * Quadratic equation
     * Decide: a * x^2 + b * x + c = 0
     * need: 1. calculate discriminant
     * if discriminant == 0 then -b / 2 * a
     * if discriminant > 0 then 2 decision: -b + discriminant / 2a and -b - discriminant
     * if discriminant < 0 print Nan
     * else throw exception
     */
    private fun decideQuadraticEquation() {
        val (a , b , c) = List(3) { readln().toDouble()}
        val discriminant = b.pow(2) - 4 * a * c
        when {
            discriminant == 0.0 -> {
                val root = -b / (2 * a)
                println(root)
            }
            discriminant < 0.0 -> return
            else -> {
                val root1 = (-b + sqrt(discriminant)) / (2 * a)
                val root2 = (-b - sqrt(discriminant)) / (2 * a)
                println("%f\n%f".format(min(root1, root2), max(root1,root2)))
            }
        }
    }

    /**
     * define amount day of month
     */
    private fun printAmountDayOfMonth() {
        val numberOfMonth = readln()
        when {
            "2" == numberOfMonth -> println(29)
            //contains - проверка вхождение строки numberOfMonth в подстроку
            "3 5 7 8 10 12".contains(numberOfMonth) -> println(31)
            "4 6 9 11".contains(numberOfMonth) -> println(30)
        }
    }

    /**
     * define time of year
     * input number of mount
     * print:
     * Зима - 12 1 2; Весна - 3 4 5; Лето - 6 7 8; Осень - 9 10 11
     */
    private fun defineTimeOfYear(){
        val numberOfMonth = readln();
        when {
            "12".contains(numberOfMonth)  -> println("Зима")
            "345".contains(numberOfMonth) -> println("Весна")
            "678".contains(numberOfMonth) -> println("Лето")
            "91011".contains(numberOfMonth) -> println("Осень")
        }
    }
}