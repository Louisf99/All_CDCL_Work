from models.task import *

task1 = Task("buys grocieries", "milk, cheese, pizza, fruit", False)
task2 = Task("learn python", "learn an awesome new programming language", True)
tasks = [task1, task2]

def add_new_task(task):
    tasks.append(task)
