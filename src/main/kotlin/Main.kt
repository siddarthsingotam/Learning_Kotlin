fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    printSomething()
}

fun printSomething(){
    println("Hello there")

    var sum = 0
    for (i in 1..6){
        sum += i
        println("number $i= $sum")
    }
}