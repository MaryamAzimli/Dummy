use std::collections::HashMap;
fn main() {
    //initialize
    let mut Student = HashMap::new();
    Student.insert("name", "Mary");
    Student.insert("age", "20");
    Student.insert("department", "CS");
    
    //printing
    println!("{}", Student["name"]);
    
    //adding new value
    Student.insert("year", "3");
    println!("{}", Student["year"]);
    
    //remove
    Student.remove("year");
    //println!("{}", Student["year"]);
    
    //modify
    Student.insert("department", "computer engineering");
    println!("{}", Student["department"]);
    
    //search for key
    if Student.contains_key("age") {
        println!("Key exists.");
    } else {
        println!("key doesnt exist");
    }
    
    // Check if the value exists in the HashMap
    let found = Student.values().any(|&value| value == "Mary");

    // Print the result
    if found {
        println!("Value exists.");
    } else {
        println!("Value does not exist");
    }
    
    //loop through
    for (key, value) in &Student {
        println!("{}: {}", key, value);
    }
}