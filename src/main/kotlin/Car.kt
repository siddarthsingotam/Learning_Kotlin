import kotlin.math.min
import kotlin.math.max

class Car(val max_speed: Double = 120.0, val fuel_capacity: Double = 75.0) {
    var speed: Double = 0.0
        private set
    var fuel_level: Double = 0.0
        private set

    fun accelerate(): Double {
        var new_speed: Double = 0.0
        if (speed in 0.0..max_speed) {
            speed += 10.0
            new_speed = speed
        } else {
            speed = max_speed
            new_speed = speed
        }
        return new_speed
    }

    fun accelerateBetter(){
        val newSpeed = min(speed + 1.0, max_speed)
        val fuelNeeded = (newSpeed - speed)* 0.1
        if (fuel_level >= fuelNeeded){
            fuel_level -= fuelNeeded
            speed = newSpeed
        }
    }

    fun decelerate(){
        speed = max(speed - 1.5, 0.0)
    }
}

fun main(){
    val car0: Car = Car(max_speed=200.0, fuel_capacity=90.0)
    var the_current_speed: Double

    for (i in 1 ..8){
        the_current_speed = car0.accelerate()
        println(the_current_speed)

    }
    println("Final speed: ${car0.speed}")



}