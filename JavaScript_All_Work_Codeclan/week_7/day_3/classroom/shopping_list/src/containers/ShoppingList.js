import React, { useState } from 'react';
import ShoppingListItem from '../components/ShoppingListItem';
import ItemForm from '../components/ItemForm';


const ShoppingList = () => {

    const [shoppingList, setShoppingList] = useState(
        [
            { itemName: "Milk", price: 100 },
            { itemName: "Eggs", price: 200 },
            { itemName: "Sugar", price: 50 }
        ]
    )

    const addItem = (item) => {
        const newList = [...shoppingList, item];
        setShoppingList(newList);
    }

    const items = shoppingList.map( (item, i) => {
        return <ShoppingListItem thisItem={item} key={i}/>
    })

    return (
        <>
            <h1>Shopping List</h1>
            <ItemForm addItem={addItem}/>
            <ul>
                {items}
            </ul>
        </>
    )
}

export default ShoppingList;