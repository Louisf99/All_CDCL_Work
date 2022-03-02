from flask import Flask, blueprints, render_template
from controllers.task_controller import tasks_blueprint
from repositories import task_repository
app = Flask(__name__)
app.register_blueprint(tasks_blueprint)


@app.route('/')
def home():
    return render_template('index.html')


if __name__ == '__main__':
    app.run(debug=True)
