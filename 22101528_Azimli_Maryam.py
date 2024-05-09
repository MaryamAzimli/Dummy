#initializing
Student1 = {
    "name": "Maryam",
    "age": 20,
    "department": "Computer Engineering"
}

#printing
print(Student1["department"])

#add a new element
Student1["year"]=3
print(Student1["year"])

#remove
del Student1["year"]
#print(Student1["year"])

#modify
Student1["department"]="CS"
print(Student1["department"])

#check existence of key
if "name" in Student1:
    print("Key exists")
else:
    print("Key doesnt exist")

#check existence of value
found=False
for value in Student1.values():
    if value == "Maryam":
        found=True
        break
if found:
    print("Value exists")
else:
    print("Value does not exist")

for key, value in Student1.items():
    print(key, value)