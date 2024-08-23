class FractionMutable(
    numerator: Int,
    denominator: Int,
    polarity: Int = 1
) {
    val numerator: Int
    val denominator: Int
    val polarity: Int

    init {
        require(denominator != 0){"Cant be zero"}
        val gcd = gcd(numerator, denominator)
        this.numerator = numerator/gcd
        this.denominator = denominator/gcd
        this.polarity = polarity
    }

    override fun toString(): String {
        return "${polarity*numerator}/$denominator"
    }

    fun gcd(a: Int, b:Int): Int{
        return if (b == 0) a else gcd(b, a % b)
    }

}

//fun main(){
//    val fraction1 = FractionMutable(2, 12)
//    println("Simplified fraction: $fraction1")
//
//    val fraction2 = FractionMutable(2, 6, -1)
//    println("Simplified fraction: $fraction2")
//}