fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""

    if (input.isEmpty()) {
        println("Результат: ")
        return
    }

    val result = StringBuilder()
    var currentChar = input[0]
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            result.append(currentChar)
            if (count > 1) {
                result.append(count)
            }
            currentChar = input[i]
            count = 1
        }
    }

    result.append(currentChar)
    if (count > 1) {
        result.append(count)
    }

    println("Результат: $result")
}
