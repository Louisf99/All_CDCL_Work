
ages = [5, 15, 64, 27, 84, 26]

# def get_odd_ages(ages):
#     odd_ages = []
#     for age in ages:
#         if age % 2 == 1:
#             odd_ages.append(age)
#     return odd_ages        


odd_ages = [age for age in ages if age % 2 == 1] # single list comprehension makes the above code simplier and only one line long
print(odd_ages)



chicken_names = ["Hen Solo", "Cluck Norris", "Hennifer Lopez", "Chewpekka", "Feather Locklear"]

over_10 = [name for name in chicken_names if len(name) > 10]
print(over_10)

start_H = [name for name in chicken_names if name[0] == "H"]
print(start_H)

words = ["The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"]

letters = [word[0].lower() for word in words]
print(letters)




