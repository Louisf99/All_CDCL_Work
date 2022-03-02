def fizz_buzz(number):
  # if number % 3 == 0 and number % 5 == 0:
  #   return 'fizzbuzz'
  # elif number % 3 == 0:
  #   return "fizz"
  # elif number % 5 == 0:
  #   return "buzz"
  # return str(number)

  return "fizz"*(number%3==0) + "buzz"*(number%5==0) or str(number)