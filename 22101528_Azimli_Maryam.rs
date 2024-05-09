fn main() {
    // 2-way selection w comparison expression:
    let age = 18;

    if age >= 18 {
        println!("You are old enough to vote, but in Japan you need to be over 21 to smoke");
    } else {
        println!("You are not old enough to vote");
    }

    // 2-way selections with logical expression:
    let is_weekend = true;
    let is_raining = false;

    if is_weekend || is_raining {
        println!("It is raining or it is weekday so we cant go out, it is not like i wanted to anyways");
    } else {
        println!("We probably need to relax outside of our comfort zone, no matter how hard it will be");
    }
    
    // Example using else if:
    let temperature = 20;

    if temperature > 25 {
        println!("It's a hot");
    } else if temperature < 15 {
        println!("It's a cold day, like in ankara... we are in May come on");
    } else {
        println!("Whether is fine ig");
    }

    // Nested example:
    let has_pet = true;
    let pet_type = "hamster";

    if has_pet {
        if pet_type == "dog" {
            println!("I have a dog, never ever will i ever get a dog");
        } else {
            println!("You have a pet, cause it is hamster, but i still love the cats more");
        }
    } else {
        println!("You don't have a pet, similar to my life in dorms alone a=without a pet");
    }
}