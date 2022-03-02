import React from 'react';
import './ListItem.css';

const ListItem = ({munro, onMunroSelected}) => {
  return <li onClick={() => {onMunroSelected(munro)}}>{munro.name}</li>
}

export default ListItem;