user_input = input("Enter numbers separated by space: ")

# Convert to list of integers
numbers = list(map(int, user_input.split()))

# Check condition
if numbers[0] == numbers[-1]:
    print(True)
else:
    print(False)