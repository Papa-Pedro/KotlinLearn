package stepic

import kotlin.math.pow

class LessonThree {
    /**
     * Функция для решения задачек из степика 3.4
     */
    fun solveTask3dot4() {
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
     * Функция для решения задачек из степика 3.4
     */
    fun solveTask3dot5() {
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

    fun solveTaskThreeDotSix() {
        println("""
            Выберите номер задания:
            1. Вывести последную цифру числа;
            2. Найти число десятков;
            3. Найти сумму цифр для числа
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
            /** Вывести сумму цифр */
            "3" -> {

            }

            else -> println("Вы ввели не правильный номер! Пока!")
        }
    }
}