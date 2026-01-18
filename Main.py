# a = 34

# b = True
# print(type(b))

# a = "SHER CODER"
# # slice
# print(a[0:4:2])

# print(a[5::1])

# print("Hello! How are You")

# name = "nitya"
# age = "24"

# print("Hello my name is",name,"and my age is",age)
# print(f"my name is {name} and my age is {age}") 

# # number = int(input("Enter the number : "))
# # print(number)

# #operators
# a = 4
# b = 20
# print(a+b)
# print(b/a)
# print(b//a) 
# print(5**2)
# print(32%5)

# Assignment Operators

# a = 22
# compound assignment operators
# a = 20
# b = 20

# a += 20
# a += 40
# a += 60

# print(a)

# print(a == b)
# print(a != b)

# print(12>20 and 123>100 and 34 == 34)

# print(12 != 12 or 23 == 45 or 234>120)


# # and or not
# a = 3

# if a > 10:
#     print("I will do task A")
# else:
#     print("I will do task B")

# money = int(input("Please provide the money : "))

# if money == 10:
#     print("I will have to take the choco-ice-cream")
# elif money == 20:
#     print("i will have to mongo dolly")
# else:
#     print("I will have to take a cone")

# num1 = int(input("Please tell your first number : "))
# num2 = int(input("Please tell your second number : "))

# if num1>num2:
#     print(f"{num1} is greater than {num2}")
# else:
#     print(f"{num2} is greater then {num1}")

# gen = input("Please tell your gender as character(M or F):-")

# if gen == 'M':
#     print("Good Morning Sir")
# elif gen == 'F':
#     print("Good Morning Mam")
# else:
#     print("Unidentified gender")

# name = (input("Please tell your name:- "))
# age = int(input("Please tell your age:- "))

# if age >= 18:
#     print(f"Hello {name} you are a valid vote")

# else:
#     print(f"Hello{name} you are not a valid voter")



# year = int(input("tell your year: "))

# if year % 100 == 0 and year % 400 == 0:
#     print("its a leap year")

# elif year % 100 != 0 and year % 4 == 0:
#     print("its a leap year")
# else:
#     print("Its a normail year")


# For loop
# a = range(1,20,1)

# for i in range(-5,-15,-1):
#     print(i)

# table of 5
# for i in range(5, 51,5):
#     print(i)

# for any table to print nth rule

# n = int(input("Which table you want? "))

# for i in range(n,(n*10)+1,n):
#     print(i)

# a = "SHERYIANS"

# for i in range(len(a)):
#     print(a[i])

# for i in range(1,21):
#     if i == 15:
#         break
#     else:
#         print(i)

# n = int(input("please tell your number : "))

# for i in range(n):
#     print("hello world")

# print natural number upto n --
# n = int(input("Please tell your number: "))

# for i in range(1,n+1,1):
#     print(i)

# Reverse for loop print n to 1
# n = int(input("Please Enter the number: "))
# for i in range(n,0,-1):
#     print(i)

# Take a number as input and print its table

# n = int(input("please Enter the number: "))
# for i in range(n,n*10+1,n):
#     print(i)

# n = int(input("please Enter the number: "))

# fact = 1

# for i in range(1,n+1):
#     fact = fact * i
# print(f"Your sum is {fact}")

# factorial of the number
# n = int(input("please Enter the number: "))

# print the sum of all even and odd numbers in a range separately

# n = int(input("please Enter the number: "))

# even = 0
# odd = 0
 
# for i in range(1,n+1):
#     if i%2 == 0:
#         even = even + i
#     else:      
#         odd = odd + i

# print(f"The total sum for even is {even} and odd is {odd}")

# print all the factors of a number
# n = int(input("Which number factor you want : "))

# for i in range(1,n+1):
#     if n%i == 0:
#        print(i)   

# perfect number --

# n = int(input("Enter the number : "))
# sum = 0
# for i in range(1,n):
#     if n%i == 0:
#         sum = sum+i

# if sum == n:
#     print("Your number is perfect")
# else:
#     print("Your number is not perfect")


# check the number is prime or not --

# n = int(input("Enter the number : "))

# count = 0

# for i in range(1,n+1):
#     if n%i == 0:
#         count = count+1

# if count == 2:
#     print("your number is prime")
# else:
#     print("your number is not prime")

# Reverse a string without using a build function--

# a = "naman"
# print(a[::-1])

#OR

# b = ""
# for i in range(len(a)-1,-1,-1):
#    b = b + a[i]

# if b == a:
#    print("It is palindrome")

# else:
#    print("it is not palindrome")

# While loop---

# seprate each digit of a number and print it on the new line

# a = 256

# while a > 0:
#     print(a%10)
#     a = a//10
 
# 234 ---- 432
#reverse

# import random

# num = random.randint(1,10)

# tries = 0

# while True:
#     guess = int(input("Please guess your number: "))

#     if num == guess:
#         tries += 1
#         print(f"you are right! and your guessing is {tries} tries")

#         break
#     elif num < guess:
#         print("Choose the lower number")
#         tries += 1
#     elif num > guess:
#         print("choose the upper number")
#         tries += 1
#     else:
#         tries +=1
#         print("sorry you are wrong!")


# def palindrome(str):
#     rev = ""
#     for i in range(len(str)-1,-1,-1): 
#         rev = rev + str[i]  

#     if rev == str:
#         print("String is palindrome")
#     else:
#         print("not a palindrome")

# palindrome("namaan")

# a = [12,13,14,15,34,5]

# print(dir(list))

# l = [1,2,3,4,5]

# l.append(6)
# l.insert(1,0)
# # l.extend()
# l.clear()
# l.index()

# print(l)

# Print positive and negative elements of an list.

# l = [-45,67,12,-68,-69,34]

# print("positive elements are ")
# for i in l:
#     if i>=0:
#         print(i)

# print("Negative elements are ")
# for i in l:
#     if i<0:
#         print(i)  

# Mean of List elements--
# l = [1,2,3]

# sum = 0
# for i in range(len(l)):
#     sum = sum + l[i]
#     mean = sum/len(l)
# print(mean)

# find the greatest element and print its index too--

# l = [12,13,14,15,16,17,18,19,20,21,22,23,24,25,26]

# largest = l[0]
# index = 0

# for i in range(len(l)):
#     if l[i] > largest:
#         largest = l[i]
#         index = i
# print(f"your largest number is {largest} at index {index}")

# find the second greatest element--
# l = [12,16,13,19,17]

# largest = l[0]
# sec_largest = l[0]

# for i in l:
#     if i > largest:
#         sec_largest = largest
#         largest = i
#     elif i > sec_largest:
#         sec_largest = i
# print(f"the largest value is {largest} and second largest value is {sec_largest}")

# a = [12,13,14,15,11]

# for i in range(len(a)-1):
#     if a[i] < a[i+1]:
#         continue
#     else:
#         print("your list is not sorted")

# else:
#     print("your list is sorted!")

# a = (1,2,3,4,5)

# index = a.index(5)
# print(index)

# count = a.count(5)

# s = {1,2,3,4,5,5}
# print(s)

# print(s[0])

# a = {1,2,"hello",3,4,5}

# for i in a:
#     print(i)

# a = {1,2,3,4,5,6}

# a.remove(2)
# print(a)

# a.clear()
# print(a)


#DICTIONARY--- in python (hashmap)


# d = {10:100,20:200,30:300,40:400,50:500}

# print(d.items())

# # important -- (deep copy)--
# a = [1,2,3,4,5]

# b = a.copy()    # shallow copy
# b[0] = 100
# print(a)

# print()

# d1 = {10:100,20:200,30:300}
# d2 = {40:400,50:500,60:600}

# for i in d2:
#     d1[i] = d2[i]
# print(d1)

# a = [1,1,2,3,2,2,3,3,4,4,4,5,5,5,5,6,6,6]
# d = {}

# for i in a:
#     if i in d.keys():
#         d[i] +=1
#     else:
#         d[i] = 1 

# d1 = {10:100,20:200,40:300}
# d2 = {40:400,50:500,60:600}

# for i in d2:
#     if i in d1.keys():
#         d1[i] += d2[i] 
#     else:
#         d1[i] = d2[i]

# a = int(input("Tell your number -- "))

# Exception Handeling --



# age = int(input("tell your age : "))

# try:
#     if age < 10 or age > 18:
#         raise ValueError("your age must be between 10 and 18")
#     else:
#         print("Welcome to the club")

# except Exception as err:
#     print(f"an error occured as {err}")

# print("The club will start soon")

# ---- File Handeling ------


# r = open("superman.txt",'a')
# r.write("and now appending some content inside the file")

#----OOPs ---

# class Factory:
#     def __init__(self,material,zips,pockets):
#         self.material = material
#         self.zips = zips
#         self.pockets = pockets
    
#     def show(self):
#         print(f"your object details are {self.material},{self.pockets},{self.zips}")
    
# reebok = Factory("leather",3,2)
# campus = Factory("nylon",3,3)

# reebok.show()


# class Animal:
#     name = "lion"  
    
#     def __init__(self,age):
#         self.age = age #instance attributes
        
#     def show(self):  
#         print("how are you")
        
#     @classmethod
#     def hello(cls):
#         print("how are you brother")
        
# class Factorymumbai:     #parent class // superclass
#     a = "I am an attributes mentioned inside factory"
#     def hello(self):
#         print("hello I am a method mentioned inside Factory")
    
# class Factorypune(Factorymumbai):   #child class // subclass
#     pass

# obj = Factorymumbai()

# print(obj.a)
      
# class Factorymumbai:
#     a = "I am an attribute mentioned inside Factory"
#     def hello(self):
#         print("Hello I am a method mentioned inside Factory")
        
# class Factorypune(Factorymumbai):
#     pass      
    
# obj = Factorymumbai() 

# obj2 = Factorypune()

# print(obj2.hello())         

#---- Constructor ----

# class Animal:
#     def __init__(self,name):
#         self.name = name  #instance attributes
        
#     def show(self):
#         print(f"Hello your name is {self.name}")
        
# class Human(Animal):
#     def __init__(self,name,age):
#         super().__init__(name)
#         self.age = age

# person1 = Human("nitya") #object


# --- OOPs-----
class Factory:
    a = 12  #attributes
    
    def hello():   #method
        print("how are you")
    
    print("Hello how are you i am getting initialized")
    
obj = Factory() 
obj = Factory()

