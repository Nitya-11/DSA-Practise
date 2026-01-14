a = 34

b = True
print(type(b))

a = "SHER CODER"
# slice
print(a[0:4:2])

print(a[5::1])

print("Hello! How are You")

name = "nitya"
age = "24"

print("Hello my name is",name,"and my age is",age)
print(f"my name is {name} and my age is {age}") 

# number = int(input("Enter the number : "))
# print(number)

#operators
a = 4
b = 20
print(a+b)
print(b/a)
print(b//a) 
print(5**2)
print(32%5)

Assignment Operators

a = 22
compound assignment operators
a = 20
b = 20

a += 20
a += 40
a += 60

print(a)

print(a == b)
print(a != b)

print(12>20 and 123>100 and 34 == 34)

print(12 != 12 or 23 == 45 or 234>120)


# and or not
a = 3

if a > 10:
    print("I will do task A")
else:
    print("I will do task B")

money = int(input("Please provide the money : "))

if money == 10:
    print("I will have to take the choco-ice-cream")
elif money == 20:
    print("i will have to mongo dolly")
else:
    print("I will have to take a cone")

num1 = int(input("Please tell your first number : "))
num2 = int(input("Please tell your second number : "))

if num1>num2:
    print(f"{num1} is greater than {num2}")
else:
    print(f"{num2} is greater then {num1}")

gen = input("Please tell your gender as character(M or F):-")

if gen == 'M':
    print("Good Morning Sir")
elif gen == 'F':
    print("Good Morning Mam")
else:
    print("Unidentified gender")

name = (input("Please tell your name:- "))
age = int(input("Please tell your age:- "))

if age >= 18:
    print(f"Hello {name} you are a valid vote")

else:
    print(f"Hello{name} you are not a valid voter")



year = int(input("tell your year: "))

if year % 100 == 0 and year % 400 == 0:
    print("its a leap year")

elif year % 100 != 0 and year % 4 == 0:
    print("its a leap year")
else:
    print("Its a normail year")


For loop
a = range(1,20,1)

for i in range(-5,-15,-1):
    print(i)

table of 5
for i in range(5, 51,5):
    print(i)

for any table to print nth rule

n = int(input("Which table you want? "))

for i in range(n,(n*10)+1,n):
    print(i)

a = "SHERYIANS"

for i in range(len(a)):
    print(a[i])

for i in range(1,21):
    if i == 15:
        break
    else:
        print(i)

n = int(input("please tell your number : "))

for i in range(n):
    print("hello world")

print natural number upto n --
n = int(input("Please tell your number: "))

for i in range(1,n+1,1):
    print(i)

Reverse for loop print n to 1
n = int(input("Please Enter the number: "))
for i in range(n,0,-1):
    print(i)

Take a number as input and print its table

n = int(input("please Enter the number: "))
for i in range(n,n*10+1,n):
    print(i)

n = int(input("please Enter the number: "))

fact = 1

for i in range(1,n+1):
    fact = fact * i
print(f"Your sum is {fact}")

factorial of the number
n = int(input("please Enter the number: "))

print the sum of all even and odd numbers in a range separately

n = int(input("please Enter the number: "))

even = 0
odd = 0
 
for i in range(1,n+1):
    if i%2 == 0:
        even = even + i
    else:
        odd = odd + i

print(f"The total sum for even is {even} and odd is {odd}")

print all the factors of a number
n = int(input("Which number factor you want : "))

for i in range(1,n+1):
    if n%i == 0:
       print(i)   

perfect number --

n = int(input("Enter the number : "))
sum = 0
for i in range(1,n):
    if n%i == 0:
        sum = sum+i

if sum == n:
    print("Your number is perfect")
else:
    print("Your number is not perfect")


check the number is prime or not --

n = int(input("Enter the number : "))

count = 0

for i in range(1,n+1):
    if n%i == 0:
        count = count+1

if count == 2:
    print("your number is prime")
else:
    print("your number is not prime")

Reverse a string without using a build function--

a = "nitya"
print(a[::-1])
#OR
b = ""
for i in range(len(a)-1,-1,-1):
   b = b + a[i]
print(b)
















