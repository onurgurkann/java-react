//tüm stateleri topladığımız yer

import { combineReducers } from "redux";
import cartReducer from "./reducers/cartReducer";

const rootReducer = combineReducers({
    cart : cartReducer
})

//default olarak çıkarmak için
export default rootReducer;