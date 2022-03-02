//READ DATABASE
//this allows us to search by indivdual object ID inside a mongo database

use zoo;

const id = ObjectId('61ae241849516a6a51b3d64b');

db.animals.findOne({_id:id});

//----------------------------


//UPDATE Individual
// this allows us to choose the object by their id and update their value inside a key we specify 
// in this case we change janet to Eric in the name key
db.animals.updateOne(
    {
        _id: ObjectId('61ae241849516a6a51b3d64b')
        
    },
    {
        $set: {name: "Eric"}
    }
);
//--------------------------


//DELETE 
// allows us to delete indivudally by object id 
db.animals.deleteOne(
    {
        _id: ObjectId('61ae241849516a6a51b3d64b')
    }
);
//----------------------------------



// this prints all the data inside the anmals collection
db.animals.find();
//--------------------------