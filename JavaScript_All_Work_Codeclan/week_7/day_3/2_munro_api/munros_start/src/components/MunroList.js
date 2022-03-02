import React from 'react';
import ListItem from './ListItem';

const MunroList = ({munros, onMunroSelected}) => {

    const munrosItems = munros.map((munro, index) => {
      return <ListItem munro={munro} key={index} onMunroSelected={onMunroSelected} />
    })

  return (
    <div>
    <ul>
      {munrosItems}
    </ul>
  </div>
  )
}

export default MunroList;