import './App.css';
import React, { useEffect, useState } from 'react'

function App() {

  const [ message, setMessage] = useState('')


  useEffect(() =>
  {
  fetch('http://localhost:5000')
  .then(response => response.json())
  .then(data => setMessage(data.message))
  })


return (
  <>
  <h1>My RoS App</h1>
  <p>The Server response is: {message}</p>
  </>
)

}

export default App;