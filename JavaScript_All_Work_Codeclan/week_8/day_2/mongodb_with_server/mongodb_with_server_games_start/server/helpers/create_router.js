const express = require('express');
const ObjectId = require('mongodb').ObjectId

const createRouter = function (collection) {

  const router = express.Router();

//CRUD FUNCTIONALITY BELOW --


  //FINDS ALL
  // This makes so the home page / gathers all data from database collcetion using find and make it to an array and formats it into json array to be displayed in localhost:5000
  router.get('/', (req, res) => {
   collection//WHAT WE ARE TAKING DATA FROM
   .find()//FIND
   .toArray()// FORMATS TO ARRAY
   .then((gamedata) => res.json(gamedata))//MAKES ARRAY OF DATA INTO JSON FORMAT
  //----------------------------------------------------------------

  // This catches if there is an error assuming it is a internal server error (500), we are hardcoding this so BEWARE
   .catch((err) => {
     console.err(err);
     res.status(500)
     res.json(
       {
        status: 500,
        error: err
       }
     )


   })
  });
//-------------------------------------------------------


//FIND ONE
// this Finds individual so when you go to /api/games/"objectId" it will show you the details of the id that matches the game
router.get('/:id', ( req, res) => {
const id = req.params.id;
collection
.findOne({
  _id: ObjectId(id)
  })
.then((data) => res.json(data))
.catch((err) => {
  console.err(err);
  res.status(500)
  res.json(
    {
     status: 500,
     error: err
    }
  )


})
});
//--------------------------------------------------------

//CREATE - this lets you add another game onto the databse and then when tested in insomnia shows the new game on its own with a newly generated id for the object
router.post('/', (req, res) => {
  const newGame = req.body;
  collection
  .insertOne(newGame)
  .then((result) => {
    res.json(result.ops[0])
  })
  .catch((err) => {
    console.error(err);
    res.status(500);
    res.json({ 
      status: 500, 
      error: err });
  });
});
// --------------------------------------------------------------

//DELETE - lets you delete an individual game based on the chosen game Id through the path /api/games/"objectId"
router.delete('/:id', (req, res) => {
  const deleteGameobject = req.params.id;
  collection
  .deleteOne({ _id: ObjectId(deleteGameobject) })
  .then(result => {
    res.json(result)
  })
  .catch((err) => {
    console.error(err);
    res.status(500);
    res.json({ status: 500, error: err });
  });
});
//------------------------------------------------------------

//UPDATE - you can update an indivdual game based on the id of the game chosen through the path /api/games/"ObjectId"
router.put('/:id', (req, res) => {
  const id = req.params.id;
  const updatedGame = req.body;
  collection
  .updateOne(
    { _id: ObjectId(id)},
    { $set: updatedGame }
  )
  .then((result) => {
    res.json(result)
  })
  .catch((err) => {
    console.error(err);
    res.status(500);
    res.json({ status: 500, error: err });
  });
})


  return router;

};

module.exports = createRouter;
