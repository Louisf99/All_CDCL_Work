python_create_date = 1991

username = input("what is your name? = ")

print("good luck!! " + username)

user_guess = input("can you guess what year python was created? ")

if int(user_guess) == python_create_date:
    print("well done you are correct!!!")

else:
    print("please try again you are inccorect :(")






hungry = True
tired = True

if hungry and tired : 
    print("Hangry!!")

tired = False

if hungry or tired:
    print("grumpy!")




# ternary operator
# shortcut for writing an if statement 
# before
score = 6

if score > 5:
    result = "pass"

else:
    result = "fail"

print(result)


# after
score = 6

result = "pass" if score > 5 else "fail" 

print(result)

# line 50 is the result of using the ternary operator shortening the above code between lines 37 - 45 to one line
# you could even put print and capture the whole of line 50 in () this would evaluate the function and print pass or fail