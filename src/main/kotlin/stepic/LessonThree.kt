package stepic

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

class LessonThree {
    init {
        println("""
            Нажмите:
            1 - для запуск задач из 4 главы
            2 - для запуска задача из 5 главы
            3 - для запуска задача из 6 главы
            4 - для запуска задача из 7 главы
            5 - для запуска задача из 8 главы
        """.trimIndent())

        when(readln()) {
            "1" -> solveTask3dot4()
            "2" -> solveTask3dot5()
            "3" -> solveTaskThreeDotSix();
            "4" -> solveTaskThreeDotSeven()
            "5" -> solveTaskThreeDotEight()
            else -> println("Вы ввели невалидный символ")
        }
    }
    /**
     * Функция для решения задачек из степика 3.4
     */
    private fun solveTask3dot4() {
        //Приветсвие
        print("Привет, %s".format(readln()));
        //Повторяет введеное слово на экран со словами « - лучшая книга!»
        print("%s - лучшая книга!".format(readln()));
        //На вход три строки, просто вывести их, каждую на отдельной.
        println("%s\n%s\n%s".format(readln(), readln(), readln()))
        //На вход три строки, вывести их в обратном порядке
        /*println("%3\$s\n%2\$s\n%1\$s".format(readln(), readln(), readln()))
        val template = """
            %3${'$'}s
            %2${'$'}s
            %1${'$'}s
        """.trimIndent()
        val result = template.format(readln(), readln(), readln())
        print(result);
        */
        print("""
            %3${'$'}s
            %2${'$'}s
            %1${'$'}s
        """.trimIndent()
            .format(
                readln(),
                readln(),
                readln()
            )
        )

        //вывести введённые три строки через разделитель
       /* print("%2\$s%1\$s%3\$s%1\$s%4\$s".format(readln(), readln(), readln(), readln()))

        val separator = readln();
        for (i in 0..2) {
            if (i != 2) print(readln()+separator)
            else print(readln())
        }
        */
        val input = List(4){ readln() }
        print(buildString {
            append(input[1])
            append(input[0])
            append(input[2])
            append(input[0])
            append(input[3])
        })


    }
    /**
     * Функция для решения задачек из степика 3.5
     */
    private fun solveTask3dot5() {
        /** возвести в квадрат */
        var number1 = readln().toDouble()
        print(number1.pow(2).toInt())
        //Чисто решение для степика, тк там pow не поддерживается.
//        var number = readln().toInt()
//        print(number * number)

        /** Вывести одно число – полное число километров. */
        print(readln().toInt() / 1000)

        /** Программа должна вывести x^6 при помощи трех операций. */
        var number2 = readln().toInt()
        number2 *= number2 //первая операция
        //при умножении степени складываются
        number2 *= number2 * number2 //вторая операция *= и третья *
        print(number2)

        /** Программа должна вывести произведение введенных чисел. */
        print(readln().toInt() * readln().toInt() * readln().toInt())


        /** Программа должна вывести количество яблок, которое достанется каждому школьнику. */
        var (pupil1, apple1) = readln().toInt() to readln().toInt();
        print(apple1 / pupil1)

        /** Тоже условие, но теперь вопрос сколько яблок останется в корзине */
        var (pupil, apple) = readln().toInt() to readln().toInt();
        print(apple % pupil)

        /** Вывести три последовательных числа */
        var number3 = readln().toInt()
        print("%d\n%d\n%d".format(number3, ++number3, ++number3))

        /** Стоимость трех телефонов] телефона, смысл в том что бы вывести сумму  */
        print((readln().toInt() + readln().toInt() + readln().toInt() + readln().toInt())*3)

        /** Посчитать сколько стоят пирожки
         * param price - стоимость
         * param count - колличиество
         */
        val price = readln().toDouble() * 100 + readln().toDouble()
        val count = readln().toDouble()
        print("${(price * count / 100).toInt()} ${(price * count % 100).toInt()}")

        /** Пересчитать минуты в часы и минуты */
        val minute = readln().toInt()
        print("$minute мин - это ${minute/60} час ${minute%60} минут.")


        /** Вывести на экран след. и пред. число */
        val number = readln().toInt()
        print("""
            Следующее за числом $number число: ${number+1}
            Для числа $number предыдущее число: ${number-1}
        """.trimIndent())

    }
    /**
     * Функция для решения задачек из степика 3.6
     */
    private fun solveTaskThreeDotSix() {
        println("""
            Выберите номер задания:
            1. Вывести последную цифру числа;
            2. Найти число десятков;
            3. Найти сумму цифр для числа
            4. Вывести перевернутое число
            5. Нарисовать полый квадрат со стороной n
        """.trimIndent())
        when (readln()) {
            /**
             * Вывести последную цифру числа;
             * param - на выход ЧИСЛО
             */
            "1" -> {
                //println("Введите число:")
                val numberForTaskSix = readln().toInt()
                print(numberForTaskSix % 10)
            }
            /** Вывести вторую с конца цифру для числа или 0 если цифра */
            "2" -> {
               /* val numberForTaskSix = readln().toInt()
                print(numberForTaskSix / 10 % 10)*/
                var stringForTaskSix = readln();
                stringForTaskSix = stringForTaskSix
                    .takeIf{ stringForTaskSix.length > 1 }
                    ?.reversed()?.get(1)?.toString()
                    ?: "0"
                print(stringForTaskSix)
            }
            /** Вывести сумму цифр числа из трех цифр */
            "3" -> {
                var input = readln();
                //решение в котором не важно сколько чисел
                var sum: Int = 0;
                for (char in input) {
                    sum += char.digitToInt();
                }
                println(sum)
                //прямое решение в лоб
                val number = input.toInt()
                println("${number % 10 + number / 10 % 10 + number / 100}")
                //решение через индексы
                println("${input.get(0).digitToInt() + input.get(1).digitToInt() + input.get(2).digitToInt()}")

                //println("%s\n%s\n%s".format(readln(), readln(), readln()))
                readln().toInt().let { n -> println("${n % 10 + n / 10 % 10 + n / 100}") }
            }
            /** Перевернуть число */
            "4" -> {
                //решение через строки
                print("%s".format(readln().reversed()))
                //решение через число (трехзначное)
                val number = readln().toInt();
                println("${number % 10}" + number / 10 % 10 + number / 100)
                //Решение в одну строку
                readln().toInt().let { number -> println("${number % 10}" + number / 10 % 10 + number / 100)}
                //решение вообще без строк
                println(number % 10 * 100 + number / 10 % 10 * 10 + number / 100)
            }
            /** Нарисовать квадрат со сторонаями * размером n */
            "5" -> {
                val side = readln().toInt()
                //c repeat
                for (i in 0 until side)
                    if (i == 0 || i == side - 1) {
                        print("*".repeat(side) + "\n")
                    } else {
                        print("*" + " ".repeat(side - 2) + "*\n")
                    }
                //без repeat
                for (i in 0 until side)
                    if (i == 0 || i == side - 1) {
                        for (j in 0 until side) print("*")
                        print("\n")
                    } else {
                        print("*")
                        for (j in 0 until side - 2) print(" ")
                        print("*\n")
                    }
                //через массивы
                var array: Array<Array<Char?>> = Array(side) { arrayOfNulls(side) }
                for (i in 0 until side)
                    if (i == 0 || i == side - 1) {
                        for (j in 0 until side) array[i][j] = '*'
                    }
                    else {
                        for (j in 0 until side) {
                            if (j == 0 || j == side-1) array[i][j] = '*'
                            else array[i][j] = ' '
                        }
                    }
                for (row in array) {
                    println(row.joinToString(separator = ""))
                }
            }



            else -> println("Вы ввели не правильный номер! Пока!")
        }
    }
    /**
     * Функция для решения задачек из степика 3.7
     */
    private fun solveTaskThreeDotSeven() {
        println("""
            Выберите номер задания:
            1. Посчитать радиус круга
            2. Посчитать площадь треугольника
            3. Сколь по цельсию, Хъюстон?
            4. Среднее арифметическое
            ----- далее придется импортировать import kotlin.math.*
            5. Перевести биты в байты 
            6. Вывести перемитр заданного прямоугольно треугольника
            7. Определить расстояние между двумя точками
            8. Определить расстояние в Манхетане
        """.trimIndent())
        when (readln()) {
            /** Посчитать радиус круга */
            "1" -> {
                val radius = readln().toDouble();
                println("%f".format(Math.PI * radius.pow(2)))
                println(radius * radius * 3.14)
                readln().toDouble().let { "%f".format(Math.PI * radius.pow(2)) }
            }
            /** Посчитать площадь треугольника */
            "2" -> {
                //в лоб как в курсе
                val a = readln().toDouble()
                val b = readln().toDouble()
                print(a * b * 0.5)
                //если подумать
                (readln().toDouble() to readln().toDouble()).let { (a, b) ->
                    println(a * b * 0.5)
                }
            }
            /** Перевести Кельвины в Цельсии по формуле С = 5 / 9 (F - 32) */
            "3" -> {
                //в лоб как в курсе
                val kelvin = readln().toDouble()
                println( 5.0 / 9 * (kelvin - 32) )
                //если подумать
                println(5.0 / 9 * (readln().toDouble() - 32))
            }
            /** Найти среднее арифмитическое двух чисел */
            "4" -> {
                val (firstNumber, secondNumber) = (readln().toDouble() to readln().toDouble())
                print( (firstNumber + secondNumber ) / 2 )
                //в одну строку
                (readln().toDouble() to readln().toDouble()).let { (firstNumber, secondNumber) -> println( (firstNumber + secondNumber ) / 2 ) }
            }
            /** Перевести биты в байты - вычленить 13 степень */
            "5" -> {
                println(readln().toDouble() / 2.0.pow(13.0))
            }
            /** Найти катет с = sqrt(a.pow(2) + b.pow(2), потом перемитр как сумма всех сторон
             * param - a and b даются на входе
             * */
            "6" -> {
                //Решение в лоб
                val a = readln().toDouble();
                val b = readln().toDouble();
                val c = sqrt(a.pow(2) + b.pow(2))
                println( a + b + c)
                (readln().toDouble() to readln().toDouble()).let { (a, b) -> println("%.2f".format( a + b + sqrt(a.pow(2) + b.pow(2)) ) ) }
            }
            /** Определить расстояние между двумя точками по формуле: sqrt( (x1 - x2).pow(2) + (y1 - y2).pow(2)
             * param - передаеются в порядке x1 y1 x2 y2
             */
            "7" -> {
                val firstDot: List<Double> = listOf(
                    readln().toDouble(),
                    readln().toDouble()
                )
                val secondDot: List<Double> = listOf(
                    readln().toDouble(),
                    readln().toDouble()
                )
                print( sqrt( (firstDot[0] - secondDot[0]).pow(2) + (firstDot[1] - secondDot[1]).pow(2) ) )
            }
            /** Определить расстояние между двумя точками по формуле: |x1-x2| + |y1-y2|
             * param - передаеются в порядке x1 y1 x2 y2
             */
            "8" -> {/*
                val firstDot: Map<String, Int> = mapOf(
                    "x" to readln().toInt(),
                    "y" to readln().toInt()
                )
                val secondDot: Map<String, Int> = mapOf(
                    "x" to readln().toInt(),
                    "y" to readln().toInt()
                )
                print(abs(firstDot.getValue("x") - secondDot.getValue("x")) + abs(firstDot.getValue("y") - secondDot.getValue("y")))
*/
                val x1 = readln().toInt()
                val y1 = readln().toInt()
                val x2 = readln().toInt()
                val y2 = readln().toInt()
                val result= abs(x1 - x2) + abs(y1 - y2)
                println(result)
            }
            else -> println("Введен символ не из списка, пока!")
            }


    }

    private fun solveTaskThreeDotEight() {
        println("""
            Выберите номер задания:
            1. Найти сумму и произведение трех чисел
            2. Найти число сотен
            3. Арифмитическая прогрессия
            4. Найти сумму последних трех цифр
            5. Найти гипотенузу по катетам
        """.trimIndent())
        when (readln()) {
            "1" -> {
                val inputList = List(3) { readln().toInt() }
                println("${inputList.sum()} ${inputList.reduce(Int :: times)}")

            }
            "2" -> {
                val number = readln().toInt()
                println(number / 100 % 10)
            }
            /**  Найти n-ый член арифмитической прогрессии по формуле
             * аN = a1 + d * ( n - 1 )
             * param - на вход a1, d and n
             */
            "3" -> {
                val firstA = readln().toInt();
                val d = readln().toInt()
                val n = readln().toInt()
                print("${firstA + d * ( n - 1 )}")
            }
            "4" -> {
                val number = readln().reversed();
                val sum = (number.getOrNull(0)?.digitToIntOrNull() ?: 0) +
                        (number.getOrNull(1)?.digitToIntOrNull() ?: 0) +
                        (number.getOrNull(2)?.digitToIntOrNull() ?: 0)
                print("$sum")

            }
            /** Найти гипотенузу по формуле:
             * с = sqrt ( a.pow(2) + b.pow(2) )
             */
            "5" -> {
                val a = readln().toInt()
                val b = readln().toInt()
                println(sqrt( a.toDouble().pow(2)  + b.toDouble().pow(2)))
            }
            else -> println("Вы ввели невалидный символ")
        }
    }



}