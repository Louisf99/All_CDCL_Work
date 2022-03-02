# imports function from calculator.py you dont need to use .py python is smart enough to recognise this 

import calculator 
print(calculator.add(10, 20))

# or you add an alias for the above importing method by 

import calculator as c
print(c.add(10, 20))

# you can also import by doing this
from calculator import *
print(add(10, 20))



from src.calculator import * # we are using the caluclator functions from the directory src in day 4 in terminal

print(add(10, 20))

print(subtract(25, 50))
