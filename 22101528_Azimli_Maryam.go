package main

import "fmt"

type Student struct {
	misses  int
	present bool
}

func main() {

	x := 10
	y := 2
	Student1 := Student{
		misses:  1,
		present: false,
	}
	Student2 := Student{
		misses:  1,
		present: true,
	}

	//comparison
	if (x+y)%2 == 0 {
		fmt.Println("x is even number")
	} else {
		fmt.Println("x is odd number")
	}

	//logical and else if
	if Student1.present {
		fmt.Println("Student1 is present in class")
	} else if Student2.present {
		fmt.Println("Student1 is absent from class, but Student2 is present")
	} else {
		fmt.Println("both Studen1 and Student2 are absent from class")
	}

	//nested ifs
	missesAllowed := 5
	Student3 := Student{
		misses:  3,
		present: true,
	}
	Student4 := Student{
		misses:  2,
		present: false,
	}
	if Student3 != Student4 {
		if Student3.misses > missesAllowed {
			fmt.Println("Student3 is allowed to Final")
		} else if Student4.misses < missesAllowed {
			fmt.Println("Student4 is allowed to Final")
		} else {
			fmt.Println("Neither Student3 nor Student3 are allowed to Final")
		}

	} else {
		fmt.Println("Student3 and Student4 are same people")
	}

}
