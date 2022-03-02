// console.log('app loaded', window);

document.addEventListener('DOMContentLoaded', () => {
    const title = document.querySelector('h1');
    title.textContent = 'JavaScript says hello!';
    const welcomeparagraph = document.querySelector('#welcome-paragraph');
    welcomeparagraph.textContent = 'Task is Complete!!!';
    // console.dir(welcomeparagraph)
    // console.log(welcomeparagraph)
const obj = {
    userName:  'Steve Jobs',
    passWord:  'letmein',
    account: 'premium'
};
// console.log(obj);
// console.table(obj);
// console.dir(welcomeparagraph);

const redElement = document.querySelector('.red');
redElement.textContent = 'we changed it!';
// const listitems = document.querySelectorAll('li');
// console.dir(listitems);



// CPAA - CREATE, PREPARE, ACCESS, ATTACH

// Create new DOM element 
const newListItem = document.createElement('li');
// Prepare DOM element
newListItem.textContent = 'Purple';
newListItem.classList.add('purple');
// Access the element that we want to attach it to 
const List = document.querySelector('ul');
// Attach the new element to the existing element 
List.appendChild(newListItem);

});

/* Task (5 minutes)
- Use document.querySelector to access the paragraph with the ID 'welcome-paragraph' from the DOM.
- Update the textContent of it
- What is the difference in output when you use console.log and console.dir? */
//  line 6 -8 is task 




// document.querySelector('#welcome-paragraph');
// document.querySelector('.blue');
// // document.querySelectorAll('li');
// document.getElementById('welcome-paragraph');






