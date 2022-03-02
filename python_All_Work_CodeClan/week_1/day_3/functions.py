#  define a function
def sum(a, b) :
    return a + b 

result = sum(3, 5)
#  above the code runs with 3 as A and 5 as B and return a + b, result = 8 
# sum() invokes/ calls the function
print(result)
# this prints variable result which has the function call with the arguements 3 and 5 

second_result = sum(10, 9)
print(second_result)
# above stores functions output for 10 = a and 9 = b and the function does a + b which is 10 + 9 = 19 

def func_return_multi(a, b):
    return a + b, a * b, a / b
# tuple -  returning multi values from a function
result_multi = func_return_multi(5, 9)
print(type(result_multi))
# type of data is as above mentioned tuple
print(result_multi)
print(result_multi[0])
print(result_multi[1])
print(result_multi[2])
# above the index number for the list in the function can be input to print a specific calculation from the function
print(list(result_multi))
# above returns the result_multi as a list from the function func_return_multi