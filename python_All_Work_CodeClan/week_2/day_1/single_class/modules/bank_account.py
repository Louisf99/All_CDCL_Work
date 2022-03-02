# def get_account_name(account):
#     return account["holder_name"]


class BankAccount:
    def __init__(self, holder_name, balance, account_type):
       self.holder_name = holder_name
       self.balance = balance
       self.account_type = account_type
       self.rate ={
           "personal": 10,
           "business": 50,
       }

# self is very importanat and needs to be used to let python know you are calling withing self 

    def pay_in(self, amount):
       self.balance += amount

    # def pay_monthly_fee(self):
    #    if self.account_type == "business":
    #       self.balance -= 50
    #    elif self.account_type == "personal":
    #        self.balanace -= 10

    def pay_monthly_fee(self):
        self.balance -= self.rate[self.account_type]
