a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

print("\n With 3rd variable")
print(f"Before: a={a} b={b}")

temp = a
a = b
b = temp
print(f"After: a={a} b={b}")

print("\n Without 3rd variable")
print(f"Before: a={a} b={b}")
a = a + b
b = a - b
a = a - b
print(f"After: a={a} b={b}")