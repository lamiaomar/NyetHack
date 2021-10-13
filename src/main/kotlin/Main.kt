fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 1
    val isBlessed = true
    val isImmortal = false
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    // Aura
    val auraVisible1 : String=when(karma){
        in 16..20 -> "Aura color green"
        in 11..15 -> "Aura color purple"
        in 6..10 -> "Aura color orange"
        in 0..5 -> "Aura color red"
        else -> "not defined"
    }
    println(name + " " +auraVisible1)

    
    val healthStatus: String = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

        // Player status
    println(name + " " + healthStatus)

}


 /*
    Function without return
    
    Unit Functions
    Not all functions return a value.
    Some use side effects instead to do their work,
    like modifying the state of a variable or calling other functions that yield system output.
    Think about your player status and aura display code, or the castFireball function, for example.
    They define no return type and have no return statement. They use println to do their work.

     private fun castFireball(numFireballs: Int = 2)
     { println("A fireball springs into existence. (x$numFireballs)") }
     
     In Kotlin, such functions are known as Unit functions,
     meaning their return type is Unit.What kind of type is Unit?
     Kotlin uses the Unit return type to signify exactly this: a function that returns no value.
     If the return keyword is not used, it is implicit that the return type for that function is Unit
     */





