
from flask import render_template, request, redirect
from app import app
from models.todo_list import tasks, add_new_task
from models.task import Task

@app.route('/')
# http://localhost:5000
def Home():
    return 'Home'

# @app.route('/<name>')
# # http://localhost:5000/Nicole
# def greet(name):
#     return f"Good Morning, {name}"


# index route below
@app.route('/tasks')
def index():
    return render_template('index.html', title="Todo List!", my_tasks=tasks)
# create route

@app.route('/tasks', methods=['POST'])
def create():
    # grab hold of data that was submitted in the form
    print(request.form)#Dictionary
    task_title = request.form['title']
    task_desc = request.form['description']
    # create a new task object 
    new_task = Task(task_title, task_desc, False)
    # append a new task to the task_list
    add_new_task(new_task)
    return redirect('/tasks')



@app.route('/News')
def news():
    return render_template('news.html', title="Todo List!")




