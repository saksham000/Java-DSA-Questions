# Data Types
#Int
-2132,32314
#Float
-2132.0,32314.0
#String
"Hello World",'Hello World'
#Boolean
True,False

print("Hello World",4.5)

#Variables

hello = "Hello World 2"
word = "world 2"
print(hello, word)

#Input

# myName = input('Name : ')
# age = input('Age: ')
# print(myName)
# print('Hello',myName,"My age is", age)

# Aritchmitic operator

x = 9
y = 3
res = x+y
res = x**y # It is x raise to power y
res = x//y # It removes all the decimal digits
res = x%y # It is Mod used for getting remainder
res = (x/y)*2
print(res)

# num = input('Number: ') # This will take num as str
# print(int(num)-5) # this will conver num to int just like declaring a veribale with int data type
# print(float(num)-5)

# String Methods
hel = "hello".upper()
print(hel)
print(hel.lower())
print(hel.capitalize())
print(hel.lower().count("ll"))

# Operator
a = "hello"
y=3
print(a*y)
g = "ggg"
print(a+g)

# ==
# !=
# <=
# >=
# <
# >
x = "hel"
y = "hel"
print(x==y)
print("a">'Z')
print(ord('a')) # This is used to print asscii vale of a character


# Conditional
#order of condi
# not
# and
# or
x = 2
y = 5
z = 4

res1 = x == y
res2 = y>x
res3 = z<x+2
res4 = res1 or res2 or not res3 # Here it will check if the left or right cond is true then whole will true
print(res4)
print(not True)
print(not (False and True))

#Condition Check

v = "saksham"

if v == "saksham":
    print("you are authorized")
elif v == "test":
    print("Hi again")
else:
    print("Login Again")


# Collection
#List, ordered data random data List is Mutableable
h = [4,True,"hi"]
h.append("saksham")
h.extend([1,"sa",False])
print(len(h))
print(h)

l = [4,True,'hi']
print(l.pop(0))
print(l)
print(l[1])

b = [4,False,"saksham"]
n = b[:] # this will copy the list to n
b[0]= "hu"
print(b)
print(n)

#Touple They are ImMuable we can not append, remove
# Touple is alwsys ()
x=(320,23,4,5,24,6,3)
print(x[0])

# List inside of list

f = [[],[],21321,()]


#Loops

for i in range(10):
    print(i)
    #start stop step
for i in range(10,-1,-1):
    print(i)
print("saks")

for i in [1,2,3,4,5]:
    print(i)
print("break")
u = [2,3,54,5,36,54,6]
for i in range(len(u)):
    print(u[i])

for i, element in enumerate(u):
    print(i,element)
    
# While loop
i = 0
while True:
    print('run')
    i += 1
    if i == 4:
        break;
    
# slice operator

xx = [0,1,2,3,4,5,6,7,8]
yy = ["hi",'saksham',"how","are","you"]
ss = "saksham"

# slice = xx[start:stop:step]

sliced = xx[0:4:2]
sliced = xx[:4] # stop at 4
sliced = xx[2:4] # step is 1
# easy way to revearse a list
sliced = xx[::-1]
print(sliced)
strin = ss[::2]
print(strin)

# Set Unordered but only unique
# set is set() but { is diconary}
xxx = set() # This is used to create a empty set
xxf = {3,4,5,6} # This is used to create set but not empty otherwise it will create disconary
print(type({}))
print(type(set()))

xxf.add(77)
print(xxf)
print(3 in xxf)

# Disconary is key value pair like hashmap
x = {'key':3}
x["k2"] = 56
print(x['key'])
del x["k2"] # Delete key
print(x)
print("break")
for key, value in x.items():
    print(key,value)
    
for key in x:
    print(key,x[key])
    

# Comprehansions

fff =  [x for x in range(5)]
print(fff)

# Funcations
#def is used to define a function

def func():
    print('im func')
    def func2():
        print("im fun2")
    func2()
    
func()

def funcPara(x,y):
    print(x+y)
    return x*y,x/y
    
print(funcPara(2,3))
r1,r2 = funcPara(5,6)
print(r1,r2)

# UnPack oper/ * Args and **KWargs
print("break")
def fun(x):
    def fun2():
        print(x)
        
    return fun2

fun(3)()
print("Break")

def fu(*args,**kwargs):
    pass

x = [1,23,4,35,4,6,53,753]
print(*x)


# Exception
# Rase is just like throw in java

# raise Exception("Bad")

#Handel

try:
    x = 7/0
except Exception as e:
    print(e)
finally:
    print("finnaly")
    
# Lambda one line annonymus function

x = lambda x,y: x+y # fun is taking 1 arg

print(x(2,23))

# Map and filter func

x = [1,123,21,43,432,5,436,565,7,34,523,4,2342]
mp = map(lambda i: i+2,x)
mp2 = filter(lambda i: i%2==0,x)
print(list(mp))
print(list(mp2))


## classes and objects

class Person:
    name = "saksham"
    occu = "SDE"
    networth = 10
    
    def info(self):
        print(f"{self.name} is a {self.occu}")
        
a = Person()
print(a.name)
print(a.occu)
a.info()

class Person2:
    def __init__(self,n,o): # It is used to create a Constructor
        # print("Hi from constructor")
        self.name = n
        self.occ = o
    
    def info2(self):
        print(f"{self.name} is a {self.occ}")

qq = Person2("saksha","Developer")
qq.info2()