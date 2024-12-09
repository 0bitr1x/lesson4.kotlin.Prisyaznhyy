//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(4, 5, 6, 7, 8)

    val synonyms = mapOf(
        "happy" to "joyful",
        "sad" to "unhappy",
        "fast" to "quick",
        "slow" to "sluggish"
    )
    val word = "happy"

    println("Четные элементы списка:")
    for (number in numbers) {
        if (number % 2 == 0) {
            println(number)
        }
    }

    val set1 = list1.toSet()
    val set2 = list2.toSet()
    val intersection = set1.intersect(set2)

    println("Общие числа: $intersection")
    println("Количество общих чисел: ${intersection.size}")



    if (synonyms.containsKey(word)) {
        println("Синоним для '$word': ${synonyms[word]}")
    } else {
        println("Синоним для '$word' не найден.")
    }

}