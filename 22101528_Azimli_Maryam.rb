#initialize
animal = Hash.new
animal["type"] = "dog"
animal["breed"] = "husky"
animal["age"] = 4

#print
puts(animal["type"])

#add a new element
animal["owner"] = "Maryam"
puts(animal["owner"])

#remove an element
animal.delete("owner")
puts(animal["owner"])

#modify an element
animal["breed"] = "chihuahua"
puts(animal["breed"])

#search for key
if animal.key?("breed")
  puts ("key exists.")
else
  puts ("key doesnt exist")
end

#search for value
if animal.value?("husky")
  puts "value exists"
else
  puts "value does not exist"
end

#loop through
animal.each do |key, value|
  puts "#{key}: #{value}"
end