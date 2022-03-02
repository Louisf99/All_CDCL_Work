answer = input("turn on the computer. did it boot up? please enter y or n")
if input == "y":
    print("login with password")
else:
    answer = input("is it plugged in?")
    if answer == "y":
        print("the computer is broken")
    else:
        answer = input("plug it in. did this fix the problem?")
        if answer == "y":
            print("login with password")
        else:
            print("the computer is broken.")











