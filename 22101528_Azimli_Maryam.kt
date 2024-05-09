fun main() {
    //initialize
    val animal = mutableMapOf<String, Any>(
    "type" to "dog",
    "breed" to "husky",
    "age" to "4"
    )

    //Get the value for a given key
    println(animal["type"])

    //Add a new element
    animal["owner"] = "Maryam"
    println(animal["owner"])

    //remove an element
    animal.remove("age")
    println(animal["age"])

    //change value
    animal["owner"]="Katy"
    println(animal["owner"])

    //check whether the key exists or not
    if (animal.containsKey("breed")) {
        println("It exists")
    } else {
        println("It doesnt exist.")
    }

    //check if the value exists
    if (animal.containsValue("cat")) {
        println("It exists")
    } else {
        println("It doesnt exist.")
    }

    //loop through
    for ((key, value) in animal) {
        println("$key: $value")
    }
}