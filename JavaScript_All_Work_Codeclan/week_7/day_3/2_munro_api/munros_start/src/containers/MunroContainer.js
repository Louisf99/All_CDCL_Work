import React, { useState, useEffect } from 'react';
import MunroList from '../components/MunroList';
import './MunroContainer.css';
import MunroDetail from '../components/MunroDetail';

const MunroContainer = () => {
    const [munros, setMunros] = useState([]);
    const [selectedMunro, setSelectedMunro] = useState(null);

    useEffect(() => {
      getMunros();
    }, [])

    const getMunros = function(){
        fetch('https://munroapi.herokuapp.com/munros')
        .then(res => res.json())
        .then(munros => setMunros(munros))
    }

   
 const onMunroSelected = (munro) => {
        setSelectedMunro(munro);
    }
    return (
        <div className="main-container">
            <MunroDetail munro={selectedMunro}/>
            <MunroList munros={munros} onMunroSelected={onMunroSelected} />
        </div>
    )
}

export default MunroContainer;
