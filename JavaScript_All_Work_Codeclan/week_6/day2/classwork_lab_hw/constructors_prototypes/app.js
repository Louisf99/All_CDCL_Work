const Pet = require('./pet.js');
const Person = require('./person.js');


const scooby = new Pet('Scooby Doo', 'Dog');
scooby.eat('scooby snack');



const shaggy  = new Person('Shaggy Rogers', scooby);
shaggy.greet();

const velma = new Person('Velma Dinkley', scooby);
velma.greet();


shaggy.feedPet('Scooby Snack');

