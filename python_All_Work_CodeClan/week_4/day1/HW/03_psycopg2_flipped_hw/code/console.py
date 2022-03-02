import pdb 
from models.task import Task
from models.user import User
import repositories.task_repository as task_repository 
import repositories.user_repository as user_repository
import os

task_repository.delete_all()


# useful for importing os system built in methods and this can re run and drop and restarts the database
def clear_db():
    os.system('pasql -d task_manager -f db/task_manager.sql')


# CREATE test, adding a new task for the table task and then saving it in line 6 passing the task1 variable as a arguement
task1 = Task("Create the frontend", "Bill", 120)
task_repository.save(task1)

# creating a new task and saving to database aswell
task2 = Task('blah', 'Phil', 130)
task_repository.save(task2)


# updating task1 to create a new task saved with the new description and assignee
task1.description  = "use react native"
task1.assignee = "steph"
task1.mark_complete()
task_repository.update(task1)

# # this deletes the task with an id 2 from the database
task_repository.delete(2)




result = task_repository.select_all()
for task in result:
        print(task.__dict__)

mytask = task_repository.select(2)




#  above is testing the CRUD for the table tasks

# CREATE
user1 = User("Louis", "Fletcher")
user_repository.save(user1)
user2 = User("Ben", "Cooney")
user_repository.save(user2)
user3 = User("Susan", "Scobie")
user_repository.save(user3)

# READ
user_list = user_repository.select_all()
for user in user_list:
    print(user.__dict__)

user_individual = user_repository.select(1)


# UPDATE
# user3.first_name  = "Craig"
# user3.last_name = "Mcglade"
# user_repository.update(user3)

# DELETE
# user_repository.delete(2)
# user_repository.delete_all()



task1 = Task("learn python", user1, 30)
task_repository.save(task1)

task2 = Task("learn Java", user1, 30)
task_repository.save(task2)

task_list_from_user = user_repository.tasks(user1)
for task in task_list_from_user:
    print(task.__dict__)




pdb.set_trace()