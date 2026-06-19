user_input = input("Enter numbers separated by space: ")

# Convert to tuple of integers
numbers = tuple(map(int, user_input.split()))

# Print numbers divisible by 5
for num in numbers:
    if num % 5 == 0:
        print(num)