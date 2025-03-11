

enum class ErrorCodes(val error: Int) {
    None(0),
    Unknown(1),
    ConnectionLost(300)
}

fun main() {
    val errorCodes = ErrorCodes.ConnectionLost

    when(errorCodes) {
        ErrorCodes.None -> {
            println("No error")
        }
        ErrorCodes.Unknown -> {
            println("Unknwon error")
        }
        ErrorCodes.ConnectionLost -> {
            println("Connection lost")
        }
    }

    println("errorCode has name ${errorCodes.name} and it has ordinal ${errorCodes.ordinal} and it has value ${errorCodes.error}")

    val error = ErrorCodes.valueOf("Unknown")
    println("error has name ${error.name} and it has ordinal ${error.ordinal} and it has value ${error.error}")
}