interface Process {
    fun execute(value: Int)
}


fun main() {
    // fibbonaci(8, object: Process {
    //     override fun execute(value: Int) {
    //         println(value)
    //     }
    // })

    // fibbonaci(9, {n -> println(n)})
    // fibbonaci(9, {println(it)})
    // fibbonaci(9) { println(it) }
    fibbonaci(4, ::println)
}

fun fibbonaci(limit: Int, action: (Int) -> Unit) {
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i: Int in 1..limit) {
        action(current)

        var temp = current
        prevprev = prev
        prev = temp
        current = prev + prevprev

    }
}

fun fibbonaci(limit: Int, process: Process) {
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i: Int in 1..limit) {
        process.execute(current)

        var temp = current
        prevprev = prev
        prev = temp
        current = prev + prevprev

    }
}

fun fibbonaci(limit: Int) {
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i: Int in 1..limit) {
        println(current)

        var temp = current
        prevprev = prev
        prev = temp
        current = prev + prevprev

    }
}