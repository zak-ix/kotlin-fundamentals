enum class Colors {
    RED, GREEN, BLUE
}

fun main() {
    val num = 1

    when(num) {
        1 -> println("1 is the value")
        else -> println("?? is the value")
    }


    val value = 2

    when(value) {
        in 1..10 -> println("value between 1 and 10")
        else -> println("dont know where the value is")
    }

    // when should be exhausted
    val bool = false
    when(bool) {
        true -> println("bool is true")
        else -> println("bool is false")
    }

    // when should be exhausted
    val color = Colors.RED
    when(color) {
        Colors.BLUE -> println("Color is blue")
        else -> println("Color is red or green")
    }


}