fun main() {
    val SashasScore = 12
    val KatysScore =10
    val iHaveACat = true
    val catOnesAge = 5
    val catTwosAge = 10

    // Basic usage of 2-way selection:
    if (SashasScore>KatysScore) {
        // true
        println("Sasha did better on the quiz")
    } else {
        println("Katy did better on the quiz")
    }

    // Condition containing logical expressions:
    val hasMissedClasses = true
    val numOfMisses = 2
    val missesAllowed = 5

    if (!hasMissedClasses) {
    
        println("Person haven't missed classes")
    } else if (missesAllowed > numOfMisses){// true
        println("Person has missed class, but is still allowed to take final.")
    } 
    else {
        println("Person cant take the final.")
    }


    // Nested
    if (iHaveACat) {
        // true
        if (catOnesAge < catTwosAge) {
            // true
            println("Cat one is younger than cat two")
        } else {
            println("Cat two is older than cat one")
        }
    } else {
        println("I don't have a cat")
    }
}