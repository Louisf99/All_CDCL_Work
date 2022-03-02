import React, {useState} from 'react';

const ItemForm = ( {addItem} ) => {

    const [name, setName] = useState("");

    const handleSubmit = (e) => {
        e.preventDefault();
        addItem({ itemName: name, price: 90});
    }

    return(
        <form onSubmit={handleSubmit}>
            <input 
                type="text" 
                name="itemName" 
                value={name}
                onChange={ (e) => { setName( e.target.value ) } }
            />
            <button>Add Item</button>
        </form>

    )
}

export default ItemForm;