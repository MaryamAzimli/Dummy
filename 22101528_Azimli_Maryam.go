package main

import "fmt"

func main() {

	//using make

	var student = make(map[string]interface{})

	student["name"] = "Maryam"
	student["age"] = 20
	student["role"] = "student"

	student["gender"] = "female"          //adding new key
	delete(student, "age")                //deleting key
	student["role"] = "undergrad student" //changing key's value

	if _, ok := student["age"]; ok {
		fmt.Println("Student has \"age\" key.")
	} else {
		fmt.Println("Student does not have \"age\" key.")
	}

	searchValue := "female"

	// Check if the value exists in the map
	var found bool
	for _, v := range student {
		if v == searchValue {
			found = true
			break
		}
	}

	// Print the result
	if found {
		fmt.Printf("The value '%v' exists in the map.\n", searchValue)
	} else {
		fmt.Printf("The value '%v' does not exist in the map.\n", searchValue)
	}

	for key, value := range student { // foo function
		fmt.Println(key, ":", value)
	}

	fmt.Println("Initializing using make:") //printing map as a whole
	fmt.Println("Student: ", student)       //printing map as a whole

	fmt.Println("Name:", student["name"]) // printing specific key's value
	fmt.Println("Age:", student["age"])
	fmt.Println("Role:", student["role"])
	fmt.Println("Gender:", student["gender"])

	// Using composite literal
	student2 := map[string]interface{}{
		"name": "Maryam",
		"age":  20,
		"role": "student",
	}

	fmt.Println("\nInitializing using composite literal")
	fmt.Println("Name:", student2["name"])
	fmt.Println("Age:", student2["age"])
	fmt.Println("Role:", student2["role"])
}
