fun main() {

    var outer = 5
    var inner = 5

    outerloop@ while(outer > 1) {
        outer --
        while(inner > 1) {
            inner--

            if (outer == 2) break@outerloop
            println("outer value: $outer and inner value: $inner")
        }
        inner = 5
    }

    println()
    var a = 5
    while (a > 1) {
        println(a)
        a--
    } 

    println()
    var b = 1
    do {
        println(b)
        b--
    } while(b > 1)
}