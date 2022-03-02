meals = {
"breakfast": "yoghurt", 
"lunch": "sushi", 
"dinner": "steak"
}
print(meals["breakfast"])
print("lunch" in meals)
print("sushi" in meals.values())
# # line 8 checks if the value exists
# # line 7 checks if the key exists 

meals["supper"] = "melon"
# # adds key "supper" and adds value as "melon"
print(meals)
del(meals["supper"])
print(meals)
# # line 15 deletes the key and value inside "supper"
# # if you want to clear the value inside a key and add it in later you can put meals["supper"] = None

print(list(meals))
# # above will make the dictionary into a list and will only print the keys not the values in the keys
print(list(meals.values()))
# # above will print a list of the values inside the dictionary and not the keys 

countries = {
    "uk": {
        "capital": "london",
        "population": 60000000
    },
    "spain": {
        "capital": "madrid",
        "population": 45000000
    }
}
print(countries)

print(countries["uk"]["population"])
# above prints the population of the uk from aboves dictionaries
print(countries["uk"].keys())
# above prints the keys for the dictionary "uk" withing countries dictionaries

avengers = {
    "iron man": {
        "moves":{
            "smash": 25,
            "kick": 50
        }
    }, 

    "hulk": {
        "moves":{
            "smash": 25,
            "kick": 50
        }
    }
}
 