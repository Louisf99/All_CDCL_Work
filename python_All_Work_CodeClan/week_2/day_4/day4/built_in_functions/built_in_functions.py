from typing import Iterable


numbers = [10, 20, 30, 40, 50]
# any(iterable) - find the value u wnat it to check in list and gives you boolean result if in list or not

print(any(num == 20 for num in numbers))#single list comprehension to check if number 20 is in the list and returns true or false
print(any(num == 0 for num in numbers)) 

# min(iterable) - min finds the lowest item in a list
print(min(numbers))

# max(iterable) - max finds the highest item in a list
print(max(numbers))

# sum(iterable) - add all the items in a list together 
print (sum(numbers))

# sum(iterable, start) - can use this e.g "start is an arguement" but can be used for e.g a wallet to add money given into a value already
print(sum(numbers, 100))#adds the list numbers together = 150 and adds this onto the arguemnet given of 100

# map(function, iterable, ...) # can take a function, iterable and other arguements etc

def square(number):
    return number * number 

print(map(square, numbers))
print(list(map(square, numbers)))

# filter(func, Iterable) - filter takes a function and a iterable 

def is_even(num):
    return num % 2 == 0

print(filter(is_even, numbers))
print(list(filter(is_even, numbers)))

# break 
# new list made called numbers2 to do different built in functions 




numbers2 = [10, 20, 3, 99, 50]

# sorted(Iterable, key=None, reverse=False) -reverse and key are optional 

sorted_numbers2 = sorted(numbers2)
print(f"sorted list after using sorted: {sorted_numbers2}") # prints numbers sorted in order small - big
# sorted does not alter the orginal list but sort does 
print(f"orginal list: {numbers2}") # prints orignal list

sorted_numbers2_desc = sorted(numbers2, reverse=True) # sorts list in desc order by adding and making reverse True 
print(f"sorted list in desc order after using sorted: {sorted_numbers2_desc}") 




# slice(start, stop, step ) #  - start is optional and so is step - stop is a must

slice(4) # in this line the number 4 in () refers to stop in above because this is not optional

room_name = "Ada Lovelace"

slice_result = slice(4) # slice function lets you when adding in the number lets u cut a piece out from a value so for 3 being there for "ada lovelace" it takes the first 3 index postions and stops on the number u have put it as 
print(room_name[slice_result])
print(room_name[:4]) # this is a shortcut for the above line using slice

slice_room_name = slice(4, 8) # this take from the 4th index postion and stops at the 8th and when called below prints love - this also now includes start and stop from line 43
print(room_name[slice_room_name])
print(room_name[4:8]) # this is yet again another shortcut for the above


slice_room_name_step = slice(0, 12, 2) # this uses start stop and step from line 43 
print(room_name[slice_room_name_step])
print(room_name[0:12:2])
print(room_name[0:12:2] [::-1]) # this [::-1] this makes it so it starts from the end of the list, this little code does not affect the arguemnets stop, start and step



# set(iterable) -  set removes duplicates from the iterable being the list numbers3 and
numbers3 = [3, 4, 1, 4, 5, 5, 6, 1, 1, 4, 6]

print(f"list before conversion is: {numbers3}")
print(f"list after conversion is: {set(numbers3)}")
print(set(numbers))
print(set(numbers2))
print(set(room_name))

