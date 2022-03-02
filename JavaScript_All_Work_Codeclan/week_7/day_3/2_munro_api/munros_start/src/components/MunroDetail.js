import React from "react";

const MunroDetail = ({munro}) => {
    if ( !munro ) return "Please select a Munro"
    return (
        <div>
       <h2>Name: {munro.name}</h2>
       <p>Height: {munro.height}m</p>

        </div>
    )
}
export default MunroDetail;