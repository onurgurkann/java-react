import axios from "axios"

export default class ProductService {
    getProducts() {
        return axios.get("http://localhost:8090/api/products/getall") // api adresi yazılır-ürünleri getiren servis
    }

    getByProductName(productName) {
        return axios.get("http://localhost:8090/api/products/getByProductName?productName=" + productName) // api adresi yazılır-ürünleri getiren servis
    }
}