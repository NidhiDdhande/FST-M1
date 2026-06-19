user_input = input("Enter numbers separated by space: ")

# Convert input to list of integers
numbers = list(map(int, user_input.split()))

# Calculate sum
total = 0
for num in numbers:
    total += num

print("Sum of elements:", total)