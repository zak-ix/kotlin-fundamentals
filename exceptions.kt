fun main() {
    // var a: Array<Int> = arrayOf(5)
    // try {
    //     val value = a[1]
    // } catch(t: Throwable) {

    //     println(t.message)
    // }
    try {
        throwsException()
    } catch(e: Throwable) {
        println(e.message)
    } finally {
        println("Doing this finally.")
    }

}

fun throwsException() {
    throw Exception("Some Error")
}