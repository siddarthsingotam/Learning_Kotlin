fun main(args: Array<String>) {

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    // println("Program arguments: ${args.joinToString()}")

    reversedFormat("Sandals")
}

fun printSomething() {
    println("Hello there")

    var sum = 0
    for (i in 1..6) {
        sum += i
        println("number $i= $sum")
    }
}

fun compare(a: Int, b: Int) {
    if (a >= b) {
        println(" $a is Greater than $b ")
    } else {
        println("$a not greater than $b")
    }
}

fun reversedFormat(sentence: String) {
    println(sentence.reversed())
}

