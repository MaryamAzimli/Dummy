class Cat:
    def __init__(self, name, age, owner):
        self.name = name
        self.age = age
        self.owner = owner

def main ():

    Lil = Cat("Lil", 5, "Sasha")
    Goldy = Cat("Goldy", 2, "Mary")
    Creamy_pie = Cat("Creamy-pie", 3, "Sasha")

    # Basic usage of two-way selection:
    x = 12

    if Lil.age>Goldy.age:
        # true
        print("Goldy needs to bow at Lil as she is younger")
    else:
        print("Lil is younger so she is the one that needs to bow to Goldy")

    # Condition containing logical expressions:
    y = False
    if y or x > 15:
        # false
        print("y is true or x is greater than 15")
    else:
        print("y is falsy and x is less than 15")

    # Example using elif:
    age = 18

    if age < 18:
        print("You are under 18 years old")
    elif age == 18:
        print("You are 18 years old")
    else:
        print("You are older than 18 years")

    # Nested example:
    i_have_a_cat = True
    

    if i_have_a_cat:
        if Creamy_pie.owner == Lil.owner:
            print(Creamy_pie.owner, " has two cats.")
        else:
            print(Creamy_pie.owner, "is owner of creamy-pie and has only onw cat")
    else:
        print("I don't have a cat.")
main()
    