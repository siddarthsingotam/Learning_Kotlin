package Labs.Lab01

open class Human (val name: String, var age: Int){

    fun getOlder(){
        this.age += 1
    }
}

//fun main() {
//    val human: Human = Human(name = "Siddarth", age = 20)
//    println(human.age)
//    human.getOlder()
//    println(human.age)
//}