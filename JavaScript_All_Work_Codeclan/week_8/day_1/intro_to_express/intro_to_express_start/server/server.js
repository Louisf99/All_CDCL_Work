const express = require('express');
const app = express();
const cors = require('cors');

app.use(cors());


app.get('/', function( req, res ){
 res.json({message: "Hello RoS V2"})
});

app.listen (5000, function(){
    console.log('App running on port 5000');
});