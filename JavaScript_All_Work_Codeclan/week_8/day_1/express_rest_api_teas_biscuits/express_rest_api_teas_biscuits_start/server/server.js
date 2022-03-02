const express = require('express');
const app = express();
const cors = require('cors');
const createRouter = require('./helpers/create_router');


const teas = [
  { name: "Early Grey", brand: "Twinings" },
  { name: "Irish Breakfast", brand: "Barry's Tea" },
  { name: "Lemon and Ginger", brand: "Lipton" },
  { name: "Rooibos", brand: "Tick Tock" },
  { name: "Green", brand: "Clipper" }
];

const biscuits = [
  { name: "Digestives", brand: "McVitie's" },
  { name: "Hobnobs", brand: "McVitie's" },
  { name: "Shortbreads", brand: "Walkers" },
  { name: "Jammy Dodgers", brand: "Burton's" },
  { name: "Custard Creams", brand: "Crawford's" }
];

app.use(cors());
app.use(express.json());

const teasRouter = createRouter(teas);
app.use('/api/teas', teasRouter)

const biscuitRouter = createRouter(biscuits);
app.use('/api/biscuits', biscuitRouter)

// // CRUD FUNCTIONALITY --


// //READ ALL ---------------
// // /api/teas - Index (GET)
// app.get ('/api/teas', ( req, res ) => {
// res.json(teas);
// });
// //------------------




// //READ Individual -----------------
// // /api/teas/:id - Show (GET)
// app.get('/api/teas/:id',  ( req, res ) => {
//   res.json( teas[req.params.id] )
// });
// //--------------------



// //CREATE INDIVIDUAL - adding a new tea with name and brand to array teas -----------
// // /api/teas - Create (POST)
// app.post('/api/teas', ( req, res ) => {
//   teas.push(req.body);
//   res.json(teas);
// })
// //----------------------------



// //DELETE INDIVIDUAL -----------------
// // /api/teas/:id - Destroy (DELETE)
// app.delete('/api/teas/:id', (req, res) => {
//   teas.splice(req.params.id, 1);
//   res.json(teas);
// })
// //-----------------------------


// //UPDATE
// // /api/teas/:id - Update (PUT) ----------------
// app.put('/api/teas/:id', ( req, res ) => {
//   teas[req.params.id] = req.body;
//   res.json(teas);
// })
// //-------------------------------

app.listen(5000, function () {
  console.log(`App running on port ${ this.address().port }`);
});














