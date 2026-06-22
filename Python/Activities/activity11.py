fruits = {
    "apple": 100,
    "banana": 40,
    "orange": 60,
    "mango": 120
}

# Take input from user
fruit_name = input("Enter fruit name: ").lower()

# Check availability
if fruit_name in fruits:
    print(f"{fruit_name} is available at price {fruits[fruit_name]}")
else:
    print(f"{fruit_name} is not available")