from db.run_sql import run_sql
from models.user import User
from models.task import Task
# DELETE
def delete_all():
    sql =  "DELETE from users"
    run_sql(sql)

def delete(id):
    sql = "DELETE FROM users WHERE id = %s"
    values =[id]
    run_sql(sql, values)

# CREATE
def save (user):
    sql = f"INSERT INTO users(first_name, last_name) VALUES (%s, %s) RETURNING *"
    values = [user.first_name, user.last_name]
    results = run_sql(sql, values)
    id = results[0]['id']
    user.id = id
    return user

# READ ALL
def select_all():  
    users = [] 

    sql = "SELECT * FROM users"
    results = run_sql(sql)

    for row in results:
        user = User(row['first_name'], row['last_name'], row['id'] )
        users.append(user)
    return users

# READ Individual
def select(id):
    # create empty variable
    user = None
    # create SQL string
    sql = f"SELECT * FROM users WHERE id = %s"
    # create our values list
    values = [id]
    # run SQL and capture result
    result = run_sql(sql, values)[0]
    # create a new task object 
    if result is not None:
        user = User(result['first_name'], result['last_name'], result['id'])
    # return task object
    return user

# UPDATE
def update(user):
    sql = "UPDATE users SET (first_name, last_name) = (%s, %s) WHERE id = %s"
    values = [user.first_name, user.last_name, user.id]
    run_sql(sql, values)
    


    # function to return all the tasks that are assigned to a user from there user_id 
def tasks(user):

    tasks = []
    sql = "SELECT * FROM tasks WHERE user_id = %s"
    values = [user.id]
    results = run_sql(sql, values)

    for row in results:
        task = Task(row['description'], user, row['duration'], row['completed'], row['id'])
        tasks.append(task)
    return tasks

