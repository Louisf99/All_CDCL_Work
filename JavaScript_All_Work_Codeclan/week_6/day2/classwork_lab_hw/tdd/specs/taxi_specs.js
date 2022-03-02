const assert = require('assert');
const Taxi = require('../taxi');

describe('Taxi', function(){

    let taxi;
beforeEach(function(){
    taxi = new Taxi('Toyota', 'Prius', 'Bob');
})

    it('should have a manufacturer', function(){
        const actual = taxi.manufacturer;
        assert.strictEqual(actual, 'Toyota');
    });

    it('should have a model', function(){
        const actual = taxi.model;
        assert.strictEqual(actual, 'Prius');
    });
    it('should have a driver', function(){
        const actual = taxi.driver;
        assert.strictEqual(actual, 'Bob');
    });


        describe('passengers', function(){
    it('should start with no passengers', function(){
        const actual = taxi.passengers;
        assert.deepStrictEqual(actual, [])
    })
        
  
    it('number of passengers', function(){
        const actual = taxi.numOfPassengers();
        assert.strictEqual(actual, 0)
    })
        
    it('should add passengers', function(){
        taxi.addPassenger('Nicole')
        const actual = taxi.numOfPassengers();
        assert.strictEqual(actual, 1)
    })
        
    it('should remove passenger by name', function(){
        taxi.addPassenger('nicole')
        taxi.addPassenger('andrew')
        taxi.removeByName('nicole');
        const actual = taxi.passengers
        assert.deepStrictEqual(actual, ['andrew'])
    })
    
    it('should remove all passengers', function(){
        taxi.addPassenger('nicole')
        taxi.addPassenger('andrew')
        taxi.removeAllPassengers()
        const actual = taxi.numOfPassengers();
        assert.strictEqual(actual, 0);
    })
  }) 
})
