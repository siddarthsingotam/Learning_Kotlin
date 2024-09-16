package NumberGuesser

class NumberGuesser {
    val numberRange: IntRange = 1..10
    val computerGuess: Int = numberRange.random()

    fun checkGuess(userInput: Int){
        when {
            (userInput < computerGuess) -> println("Guess higher")
            (userInput > computerGuess) -> println("Guess lower")
            else -> println("Correct guess! ")

        }
    }

    fun startGame(){
        var input: Int
        do {
            println("Enter number: ")
            input = readln().toInt()
            checkGuess(input)
        } while (input != computerGuess)
    }
}

fun main() {
    val numberGuesser: NumberGuesser = NumberGuesser()
    numberGuesser.startGame()
}