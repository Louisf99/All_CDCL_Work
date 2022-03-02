use zoo;
db.dropDatabase;

db.animals.insertMany(
    [
        {
            name: "janet",
            type: "polar bear"
        },
        {
            name: "norman",
            type: "penguin",
            age: 5
        }

    ]
);
//line 2 drops the database 
// this allows us to enter these two objects into a database called zoo and insert them into a collection called animals 
