import React from 'react';

const ShoppingListItem = ( { thisItem } ) => {

    return (
        <li>{ thisItem.itemName }: {thisItem.price}p</li>
    )

}

export default ShoppingListItem;