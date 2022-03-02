# Python's built-in functions


In this lesson we will have a look at some of Python built-in functions that will simplify our code making it cleaner, easier to read and in some scenarios, even faster.

### any()

The **any()** function returns **True** if any element of an iterable is **True**. If not, it returns **False**.


**Syntax**

```Python
any(iterable)
```

**Example**

```Python
boolean_list = [True, False, True]

# check if any element is true
result = any(boolean_list)
print(result)

# Output: True
```

The **any()** function takes an iterable (_list, dictionary, string etc_) in Python and return one of the following boolean values:

- `True` if at least one element of the iterable is true.
- `False` if all elements are false or if the iterable is empty.

```Python
numbers = [10, 20, 30, 40, 50]
print(any(num == 20 for num in numbers))
# Output: True
      
print(any(num == 60 for num in numbers))
# Output: False
```

---

### min()

The **min()** function **_returns the smallest_** item in an iterable. It can also be used to find the smallest item between two or more parameters.

**Syntax**

```Python
min(iterable)
```
**Example**

```Python
numbers = [1, 99, 10, 2, 13]

# find the smallest number
min_number = min(numbers)
print(f"The smallest number is {min_number}")
```


>**Output**
>
```
The smallest number is 1
```

---

### max()

The **max()** function **_returns the largest_** item in an iterable. It can also be used to find the largest item between two or more parameters.

**Syntax**

```Python
max(iterable)
```
**Example**

```Python
numbers = [1, 99, 10, 2, 13]

# find the largest number
max_number = max(numbers)
print(f"The largest number is {max_number}")
```


>**Output**
>
```Python
The largest number is 99
```

---

### sum()

The **sum()** function adds the items of an iterable and **_returns the sum_**.

**Syntax**

```Python
sum(iterable, start)
```

- **start**(optional) - this value is added to the sum of items of the iterable. The default value of start is 0 (if omitted)

**Example**

```Python
numbers = [10, 20, 30, 40, 50]

# no start parameter 
numbers_sum = sum(numbers)
print(numbers_sum)

# start = 100
numbers_sum = sum(numbers, 100)
print(numbers_sum)
```


>**Output**
>
```Python
150
250
```

---

### map()

The **map()** function applies a given function to each item of an iterable (list, tuple etc.) and returns an object of map class. The returned value can be passed to functions like _list()_ and _set()_.

**Syntax**

```Python
map(function, iterable, ...)
```
>You can pass more than one iterable to the map() function.

**Example**

```Python
def square_numbers(number):
	return number * number

numbers = [1,2,3,4,5]

print(map(square_numbers, numbers))
print(list(map(square_numbers, numbers))) 
```

>**Output**
>
```Python
<map object at 0x7f80e66807f0>
[1, 4, 9, 16, 25]
```


---


### filter()

The **filter()** function extracts elements from an iterable for which a function returns True. The return value from **filter()** is an iterator.

**Syntax**

```Python
filter(function, iterable)
```

**Example**

```Python
numbers = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55]

# returns True if number is even
def is_even(number):
    return number % 2 == 0

# Extract elements from the numbers list for which is_even() returns True
even_numbers_result = filter(is_even, numbers)
print(even_numbers_result)

# converting to list
even_numbers = list(even_numbers_result)
print(even_numbers)
```


>**Output**
>
```Python
<filter object at 0x7fd4900accd0>
[0, 2, 8, 34]
```

---

### sorted()

The **sorted()** function sorts the elements of a given iterable in a specific order (ascending or descending) and returns it as a list.

**Syntax**

```Python
sorted(iterable, key=None, reverse=False)
```
>**reverse** (Optional) - If True, the sorted list is reversed (or sorted in descending order). Defaults to False if not provided.

**Example**

```Python
numbers = [4, 2, 99, 45, 12, 8, 16]

# Creates a copy of the original list with sorted values
sorted_numbers = sorted(numbers)
print(f'sorted list after using sorted: {sorted_numbers}')

# Original list is still exits 
print(f'original list: {numbers}')

# Sorts the list in descending order
sorted_numbers_desc = sorted(numbers, reverse=True)
print(f'sorted list in descending order: {sorted_numbers_desc}')


# Sort does not return any value and will muatate the original list.
numbers.sort()
print(f'sorted list after using sort: {numbers}')

```

>**Output**
>
```Java
sorted list after using sorted: [2, 4, 8, 12, 16, 45, 99]
original list: [4, 2, 99, 45, 12, 8, 16]
sorted list in descending order: [99, 45, 16, 12, 8, 4, 2]
sorted list after using sort: [2, 4, 8, 12, 16, 45, 99]
```

---

### slice()

The **slice()** function returns a _slice object_ that is used to slice any sequence (string, list, range, etc).

**Syntax**

```Python
slice(start, stop, step)
```
>
- start (optional) - int value where the slicing of the object starts. Default None.
- stop - int value until which the slicing takes place. The slicing stops at last element.
- step (optional) - int value which determines the increment between each index for slicing. Default None.

**Example**

```Python
room_name = 'Ada Lovelace'

# start = None, stop = 4, step = None
slice_result = slice(4) 
print(room_name[slice_result])  # Ada
# shorthand
print(room_name[:4])

# start = 5, stop = 8, step = None
slice_result = slice(4, 8)
print(room_name[slice_result]) # Love
# shorthand
print(room_name[4:8])

# start = 0, stop = 6, step = 2
slice_object = slice(0, 12, 2)
print(room_name[slice_object])   # AaLvlc
# shorthand
print(room_name[0:12:2])

```


---


### set()

The **set()** method is used to convert any of the iterable to sequence of iterable elements with unique elements.

**Syntax**

```Python
set(iterable)
```
>**iterable**(optional), it will return an empty set if no parameters are passed or set from the given iterable.

**Example**

```Python
numbers = [ 3, 4, 1, 4, 5, 5, 6, 1, 1, 4, 6]
 

# Printing iterables before conversion
print(f'The list before conversion is : {numbers}')


# Printing after conversion 
new_set = set(numbers)
print(f'The list after conversion is : {new_set}')
```


>**Output**
>
```
The list before conversion is : [3, 4, 1, 4, 5, 5, 6, 1, 1, 4, 6]
The list after conversion is : {1, 3, 4, 5, 6}
```
