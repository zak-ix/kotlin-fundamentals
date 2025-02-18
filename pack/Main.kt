package pack

interface Logger {
    fun debug(message: String)
    fun info(message: String)
}


class StdoutLogger(): Logger {
    override fun debug(message: String) {
        println(message)
    }

    override fun info(message: String) {
        println(message)
    }
}


// ------------------------------ //


abstract class SpaceBody(name: String) {
    abstract fun calculateMotion()
}


open class Planet(val name: String, val diameter: Int, val logger: Logger): SpaceBody(name) {
    open var population: Long = 0

    // primary constructor
    init {
        println("Class created with $name")
        population = 0
    }

    val radius: Int = diameter / 2
    // secondary constructor, they can be multiple
    constructor(name: String, diameter: Int, gaseous: Boolean, logger: Logger): this(name, diameter, logger)

    private fun initPopulationRun(startDate: Int, endDate: Int, startPopulation: Int) {
        // do something
    }

    open fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int): Long {
        logger.debug("Starting the function")
        initPopulationRun(startDate, endDate, startPopulation)
        return population
    }

    override fun calculateMotion() {
        
    }
}

class HabitatPlanet(name: String, diameter: Int, logger: Logger): Planet(name, diameter, logger) {
    override var population: Long = 1_000_000_000

    override fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int): Long {
        return super.runPopulationModel(startDate, endDate, startPopulation)
    }
}

class TestPlanet {
    
    lateinit var planet: Planet
    
    fun setup() {
        // planet = Planet("Mars", 223144)
    }

    fun test() {
        planet.population
    }
}



// ----------------------------------- //

@JvmInline
value class Score(val score: Int) {
    init {
        if (score < 0 || score > 100) throw IllegalArgumentException()
    }
}


class Exam {
    fun score(name: String, studentScore: Score) {
        // ...
    }

    fun amendScore(id: Int, newScore: Score) {

    }
}


fun main() {

    var stdoutLogger = StdoutLogger()

    val earth = Planet("Earth", 123442, false, stdoutLogger);
    earth.population = 7_000_000_000
    println("created class " + earth.name +" with diameter as " + earth.diameter + "and radius as " + earth.radius + "and its population is " + earth.population)
    val newPopulation = earth.runPopulationModel(0, 500, 7000)
    println(newPopulation)
}