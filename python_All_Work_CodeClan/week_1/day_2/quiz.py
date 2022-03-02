# my_num = 5
# value = int(input("what number am i thinking of"))

# while (value != my_num):
#     if (value > my_num):
#         print("too high")
#     else:
#         if (value < my_num):
#              print("too low try again")
#              value = int(input("try again..."))
# print("you got it")






while(True):
    line = input("type something:")
    if(line.lower() == "q"):
        break
print(f"you typed:{line}")



numbers = [1, 2, 3, 4, 5]

for number in numbers:
    print(number * 2 )

total = 0
for number in  numbers:
    total = total + number 
    
print(total)

chickens = ["margaret", "hetty", "henrietta", "audrey", "mabel"]

for name in chickens:
    print(name)









chickens = [
  {"name": "Margaret", "age": 2, "eggs": 0},
  {"name": "Hetty", "age": 1, "eggs": 2},
  {"name": "Henrietta", "age": 3, "eggs": 1},
  {"name": "Audrey", "age": 2, "eggs": 0},
  {"name": "Mabel", "age": 5, "eggs": 1},
]

total = 0
 
for chicken in chickens:
    total += chicken['eggs']
    chicken['eggs'] = 0
# above this targets the key egg and makes every chicken inside the dictionary chickens have there eggs made to 0 you are adding total = o to chicken['egg']
print(f"{total} eggs collected")
print(chickens)


# for chicken in chickens :
print(f"{chicken['name']} is {chicken['age']}")               
   




