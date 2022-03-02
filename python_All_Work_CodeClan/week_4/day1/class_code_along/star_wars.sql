DROP TABLE lightsabers;
DROP TABLE characters;

CREATE TABLE characters (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    darkside BOOLEAN NOT NULL,
    age INT 
);

CREATE TABLE lightsabers (
    id SERIAL PRIMARY KEY,
    hilt_metal VARCHAR(255) NOT NULL,
    colour VARCHAR(255) NOT NULL,
    character_id INT REFERENCES characters(id)

);

INSERT INTO characters (name, darkside, age) VALUES ('Obi-wan Kenobi', false, 27);
INSERT INTO characters (name, darkside, age) VALUES ('Anakin Skywalker', false, 19);
INSERT INTO characters (name, darkside, age) VALUES ('Darth Maul', true, 32);
INSERT INTO characters (name, darkside) VALUES ('Yoda', false);
INSERT INTO characters (name, darkside, age) VALUES ('Luke Skywalker', false, 17);
-- INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
-- INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
-- INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
-- INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
-- INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);

INSERT INTO lightsabers (hilt_metal, colour, character_id) VALUES ('palladium', 'blue', 1);
INSERT INTO lightsabers (hilt_metal, colour, character_id) VALUES ('gold', 'red', 2);
INSERT INTO lightsabers (hilt_metal, colour, character_id) VALUES ('gold', 'red', 444);




--  above 9 -18 is create function in sql 
SELECT * FROM characters;
-- line 14 is a read function in sql
 

UPDATE characters SET (name, darkside) = ('Darth Vader', true) WHERE name = 'Anakin Skywalker';
UPDATE characters SET age = 65 WHERE name = 'Obi-wan Kenobi';
UPDATE characters set age = 30 WHERE id = 7;
--  line 19 and 20 is a update function in sql

SELECT * FROM characters;

DELETE FROM characters WHERE name = 'Darth Maul'; -- this deletes a specific row of data 
-- DELETE FROM characters - this deletes all

SELECT * FROM characters;
SELECT * FROM lightsabers;
select * from lightsabers WHERE character_id = 444 -- this is checkin character_id and becuase there is no 444 character_id set it returns no results  

