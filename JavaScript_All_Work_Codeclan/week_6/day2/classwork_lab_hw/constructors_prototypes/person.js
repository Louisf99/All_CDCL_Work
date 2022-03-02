const Person = function (name, pet) {
    this.name = name;
    this.pet = pet;
}

Person.prototype.greet = function () {
    console.log(`Hi my name is' ${this.name}`);
}

Person.prototype.feedPet = function (food) {
    console.log(`${this.name} fed ${this.pet.name} a ${food}`)
    this.pet.eat(food);
}


// const shaggy  = new Person('Shaggy Rogers');
// // console.log('shaggy:', shaggy.name);
// shaggy.greet();

// const velma = new Person('Velma Dinkley');
// velma.greet();


// console.log('shaggys prototype', Object.getPrototypeOf(shaggy))
// console.log('Velmas prototype', Object.getPrototypeOf(velma))

module.exports = Person;