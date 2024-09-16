package DesignPatterns.Factory

interface Animal {
    val id: Int
    val type: String
}

class Cat(override val id: Int): Animal{
    override val type = "Cat"
}

fun createList(): List<String>{ return listOf("item1", "item2")}

