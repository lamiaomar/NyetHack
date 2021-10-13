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





