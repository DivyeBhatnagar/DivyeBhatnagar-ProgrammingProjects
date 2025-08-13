a = int(input("Enter first number: "))
op = input("Enter operator: ")
b = int(input("Enter second number: "))

if op == '+':
    print(a + b)
elif op == '-':
    print(a - b)
elif op == '*':
    print(a * b)
elif op == '/':
    if b != 0:
        print(a // b)  # Integer division like Java
    else:
        print("Error: Division by zero")
else:
    print("Invalid operator")