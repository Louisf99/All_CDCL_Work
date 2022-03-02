const express = require('express');

const createRouter = function (data) {

  const router = express.Router();

  //READ ALL
  router.get('/', (req, res) => { 
    res.json(data);
  });


  //READ INDIVIDUAL
  router.get('/:id', (req, res) => { 
    res.json(data[req.params.id]);
  });


  //CREATE 
  router.post('/', (req, res) => { 
    teas.push(req.body);
    res.json(data);
  });


  //UPDATE
  router.put('/:id', (req, res) => { 
    teas[req.params.id] = req.body;
    res.json(data);
  });


  //DELETE INDIVIDUAL
  router.delete('/:id', (req, res) => { 
    teas.splice(req.params.id, 1);
    res.json(data);
  });
return router;

};

module.exports = createRouter;