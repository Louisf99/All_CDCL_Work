chickens = [
  { "name": "Margaret", "age": 2, "eggs": 0 },
  { "name": "Hetty", "age": 1, "eggs": 2 },
  { "name": "Henrietta", "age": 3, "eggs": 1 },
  { "name": "Audrey", "age": 2, "eggs": 0 },
  { "name": "Mabel", "age": 5, "eggs": 1 },
]

def count_eggs(list):
    total_eggs = 0

    for bird in list:
        total_eggs += bird["eggs"] # total_eggs adds key "eggs" value for each chicken 
        bird["eggs"] = 0 # eggs have been collected and resets total to 0 as no more eggs there ALL GONE!

    return f"{total_eggs} eggs collected"
# above line is return a string so to do this we use = return f"{key name} string" = this returns all one string with the key value in the string

print(count_eggs(chickens))

# total_eggs scope is local and only used in the function and cannot be used outside of the function 