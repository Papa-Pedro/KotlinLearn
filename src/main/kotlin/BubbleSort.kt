class BubbleSort {

    /**
     * Метод для точки входа и выбора сортировки
     */
    fun sortingArray() {
        println("Введите массив: ");
        val array = inputArray();
        println("Выберите метод сортировки: \n1. Сортировка с помощью рекурсии" +
                "\n2. Сортировка с помощью вложенного цикла")
        when(readlnOrNull()) {
            "1" -> System.out.printf("Отсортированный массив = %s", bubbleSortAtRecursion(array, array.size))
            "2" -> System.out.printf("Отсортированный массив = %s", bubbleSortByCycle(array))
            else -> println("Вы ввели ни 1 и ни 2. Пока!")
        }

    }

    /**
     * Метод читает строку из консоли в переменную `input`,
     * затем разбивает её по пробелам и преобразует в числа.
     *
     * @return array for sort
     */
    private fun inputArray(): IntArray {
        val input: String = readlnOrNull() ?: ""; //it's local constant for get a array value
        return input
            .split(" ")//Разбивает строку по " "
            .map { it.toInt() } //Преобразование каждого элемента в toInt()
            .toIntArray();
    }

    /**
     * Метод для сортировки массива через рекурсию
     * ничего не возвращает тк доступ по ссылке
     *
     * @param array - массив для сортировки
     * @param size - до какого элемента сортируем
     * @return array - отсортированный массив
     */
    private fun bubbleSortAtRecursion(array: IntArray, size: Int): String {
        for (i in 0 until  size - 1 ) {
            if (array[i] > array[i+1]) {
                // Без буфферной переменной
                array[i] = array[i + 1].also { array[i + 1] = array[i] }
            }
        }
        if (size > 2) bubbleSortAtRecursion(array, size -1 )

        return array.contentToString();
    }

    /**
     * Функция для пробегания по массиву и перемещения макс элемента в конец через вложенный цикл
     *
     * @param array - массив для сортировки
     */
    private fun bubbleSortByCycle (array: IntArray): String {
        for (j in array.size - 1 downTo 1 )
            for (i in 0 until j)
                if (array[i] > array[i + 1]) {
                    val buffer = array[i + 1];
                    array[i + 1] = array[i]
                    array[i] = buffer
                }
                println(array.contentToString())

        return array.contentToString();
    }

}