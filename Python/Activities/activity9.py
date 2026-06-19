l1 = list(map(int, input("Enter first list: ").split()))
l2 = list(map(int, input("Enter second list: ").split()))

result = []

# Odd from first list
for num in l1:
    if num % 2 != 0:
        result.append(num)

# Even from second list
for num in l2:
    if num % 2 == 0:
        result.append(num)

print("Result:", result)