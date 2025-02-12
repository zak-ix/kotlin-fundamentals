fun main() {
    val a: IntRange = 1..10
    val b: CharRange = 'a'..'z'

    for (i in 1..10) {
        println("i: $i")
    }

    for (i in 1..10 step 2) {
        println("step i: $i")
    }

    for (i in 10 downTo 1) {
        println("downto i: $i")
    }

    for (i in 1 until 10) {
        println("until i: $i")
    }

    var nums = arrayOf(1,2,3,4,5,6,7,8)
    for ((index, num) in nums.withIndex()) {
        println("number $num at index $index")
    }

    val people = HashMap<String, Int>()
    people["sam"] = 31
    people["alex"] = 33
    people["ali"] = 43

    for ((name, age) in people) {
        println("Name: $name, Age: $age")
    }

    for (person in people) {
        println(person)
    }
}