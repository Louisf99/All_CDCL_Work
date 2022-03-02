document.addEventListener('DOMContentLoaded', () => {
console.log('JavaScript has loaded');

const button = document.querySelector('#button');
button.addEventListener('click', handleButtonClick);


// const input = document.querySelector('#input');
// input.addEventListener('input', handleInputText)
// shorter way to do the above is - 
document.querySelector('#input').addEventListener('input', handleInputText);


document.querySelector('#select').addEventListener('change', handleSelectChange);


document.querySelector('#form').addEventListener('submit', handleFormSubmit)
});

// button click
const handleButtonClick = function() {
const resultParagraph = document.querySelector('#button-result');
resultParagraph.textContent = 'This Button has been clicked';
};



// input
const handleInputText = function(event) {
  // console.log(event)
  // get value from input and update value - 
  document.querySelector(
  '#input-result'
  ).textContent = `You Typed: ${event.target.value}`;
};



//drop down
const handleSelectChange = function(event) {
  document.querySelector(
  '#select-result'
  ).textContent = `You selected ${event.target.value}`
}
//or
const handleSelectChange = (event) => {
  document.querySelector(
  '#select-result'
  ).textContent = `You selected ${event.target.value}`
}
// or you can 
const handleSelectChange = () => {
  document.querySelector(
  '#select-result'
  ).textContent = `You selected ${this.select.value}`
}




// form 
const handleFormSubmit = function(event) {
  event.preventDefault();
  console.log(event.target.first_name.value)
  document.querySelector(
    '#form-result'
    ).textContent = `Your name is: 
    ${event.target.first_name.value}
    ${event.target.last_name.value}`
}
// or 
// const handleFormSubmit = function() {
//   e.preventDefault();
//   console.log(event.target.first_name.value)
//   document.querySelector(
//     '#form-result'
//     ).textContent = `Your name is: 
//     ${this.first_name.value}
//     ${this.last_name.value}`
//}



























// const select = document.querySelector('#select');
// select.addEventListener('click', handleSelectChoice)

// const formInput = document.querySelector('#form')
// select.addEventListener('submit', handleFormInput)

// const handleSelectChoice = function() {
// const resultSelect = document.querySelector('#select-result');
// resultSelect.textContent = 'A choice has been made';
// };

// const handleFormInput = function() {
// const resultForm = document.querySelector('#form-result');
// resultForm.textContent = 'Hello';
// };

