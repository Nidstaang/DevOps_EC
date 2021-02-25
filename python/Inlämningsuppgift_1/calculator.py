
def addition(x, y):
    return x + y

def subtraction(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    return x / y



def calculator():
    print("""\n
    Hello! ٩(ღ˘⌣˘ღ)۶ \n
    Today we're gonna try to get to the number 100. \n
    What will you try? \n
    1.Addition (+) \n
    2.Substraction (-) \n
    3.Multiplication \n
    4.Division 
    """)
    
    choice = input("Type the symbol for the desired operation (+,-,*,/):\n")

    while True:

        if choice in ('+', '-', '*', '/'):

            num1 = float(input("Enter your first number please: \n"))
            num2 = float(input("And what would the other number be? \n"))

            if choice == '+':
                return addition(num1, num2)
                break

            elif choice == '-':
                return subtraction(num1, num2)
                break

            elif choice == '*':
                return multiply(num1, num2)
                break

            elif choice == '/':
                return divide(num1, num2)
                break



def print_result(number):
    print(number)
    if 1 < number < 50:
        print('Less than fifty')
    elif number == 50:
        print('Fifty')
    elif 50 < number < 100:
        print('Almost a hundred')
    elif number == 100:
        print('Spot on')
    elif number > 100:
        print('Missed the spot!')
    else:
        print('Negative number')


print_result(calculator())
