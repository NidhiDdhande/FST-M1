name = input("Enter your name: ")
age = int(input("Enter your age: "))

# Calculate year when user turns 100
current_year = 2026
year_100 = current_year + (100 - age)

# Print result
print(name + ", you will turn 100 years old in the year " + str(year_100))