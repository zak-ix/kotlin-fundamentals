
data class Person(val name: String, val age: Int)

data class Admi(val name: String) {
    var age: Int = 0
}

fun main() {
    val sam = Person("sam", 31)
    val samuel = Person("sam", 31)
    val sammy = sam.copy(age=34)
    println("$sam has hashcode ${sam.hashCode()}")
    println("$samuel has hashcode ${samuel.hashCode()}")
    println("$sammy has hashcode ${sammy.hashCode()}")
    
    // destructuring
    val (n, a) = sammy
    println("name is $n and age is $a")

    if (sam.equals(samuel)) {
        println("both are equal")
    }

    if (sam == samuel) {
        println("both are equal structure")
    } 

    if (sam === samuel) {
        println("both are equal reference")
    }

    val ali = Admi("ali")
    val alig = Admi("ali")
    ali.age = 31
    alig.age = 32

    if (ali.equals(alig)) {
        println("both are equal")
    }

    if (ali == alig) {
        println("both are equal structure")
    } 

    if (ali === alig) {
        println("both are equal reference")
    }
}