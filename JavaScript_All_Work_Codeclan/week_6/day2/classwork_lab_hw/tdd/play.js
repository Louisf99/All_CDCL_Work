const assert = require('assert');

//assert.strictEqual(1, '1');

const firstArray = [1, 2];
const secondArray = firstArray;
assert.strictEqual(firstArray, secondArray);

assert.deepStrictEqual([1, 2, 3], ["1", "2", "3"]);