DROP TABLE IF EXISTS tasks;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL
);

CREATE TABLE tasks (
  id SERIAL PRIMARY KEY,
  description VARCHAR(255),
  duration INT,
  completed BOOLEAN DEFAULT FALSE,
  user_id int REFERENCES users(id)
);

-- INSERT INTO tasks (description, assignee, duration) 
-- VALUES ('Walk Dog', 'Jack Jarvis', 60);

-- INSERT INTO tasks (description, assignee, duration) 
-- VALUES ('Feed Cat', 'Victor McDade', 5);
