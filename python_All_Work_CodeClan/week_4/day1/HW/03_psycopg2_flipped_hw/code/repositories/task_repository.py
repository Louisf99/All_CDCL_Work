
from db.run_sql import run_sql
from models.task import Task
from models.user import User
import user_repository as user_repository

# these methods are part of CRUD 

# CREATE
def save (task):
    sql = f"INSERT INTO tasks(description, user_id, duration, completed) VALUES (%s, %s, %s, %s) RETURNING *"
    values = [task.description, task.user.id, task.duration, task.completed]
    results = run_sql(sql, values)
    id = results[0]['id']
    task.id = id
    return task

# READ
def select_all():  
    tasks = [] 

    sql = "SELECT * FROM tasks"
    results = run_sql(sql)

    for row in results:
        user = user_repository.select(row['user_id'])
        task = Task(row['description'], user, row['user_id'], row['duration'], row['completed'], row['id'] )
        tasks.append(task)
    return tasks 

def select (id):
    # create empty variable
    task = None
    # create SQL string
    sql = f"SELECT * FROM tasks WHERE id = %s"
    # create our values list
    values = [id]
    # run SQL and capture result
    result = run_sql(sql, values)[0]
    # create a new task object 
    if result is not None:
        user = user_repository.select(result['user_id'])
        task = Task(result['description'],user, result['duration'], result['completed'], result['id'])
    # return task object
    return task

# UPDATE
def update(task):
    sql = "UPDATE tasks SET (description, user_id, duration, completed) = (%s, %s, %s, %s) WHERE id = %s"
    values =[task.description, task.user.id, task.duration, task.completed, task.id]
    run_sql(sql, values)
    
# DELETE
def delete_all():
    sql =  "DELETE from tasks"
    run_sql(sql)

def delete(id):
    sql = "DELETE FROM tasks WHERE id = %s"
    values =[id]
    run_sql(sql, values)