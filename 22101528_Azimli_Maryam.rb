# Basic usage of two-way selection:
temperature = 25

if temperature > 30
  puts "It's a hot day!"
else
  puts "It's not too hot."
end

# Basic usage of 2-way selection with logical expression:
is_raining = true
is_snowing = false

if is_raining && !is_snowing
  puts "It's raining but not snowing."
else
  puts "It's not raining or it's snowing."
end

# Example using elsif:
age = 25

if age < 18
  puts "You are under 18 years old."
elsif age >= 18
  puts "You are 18 years old or older."
end

# Nested example:
has_pet = true
pet_type = "dog"
pet_name = "Fido"

if has_pet
  if pet_type == "dog"
    puts "#{pet_name} is a dog"
  elsif pet_type == "cat"
    puts "#{pet_name} is a cat and cats are superior to dogs"
  else
    puts "#{pet_name} is probably a hamster, i want to get a hamster"
  end
else
  puts "You don't have a pet"
end