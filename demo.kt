fun main() {
    val a: Int = 12
    val b: Int = 14

    /* 1st option to write IF-ELSE */
    // var min: Int
    // if (a < b) 
    //     min = a
    // else
    //     min = b

    /* 2nd option to write IF-ELSE */
    // val min: Int = if (a < b) a else b

    /* 3rd option to write IF-ELSE */ 
    val min: Int = if (a < b) {
        println("about to return a")
        a
    } else {
        println("about to return b")
        b
    }

    println("min is $min")
}