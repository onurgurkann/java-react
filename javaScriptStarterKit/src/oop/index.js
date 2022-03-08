class Customer{
    constructor(id,customerNumber){
        this.id = id;
        this.customerNumber = customerNumber;
    }
}

let customer = new Customer(1,"12345");
//prototyping
customer.name="Onur Gürkan"
console.log(customer.name)

//class prototyping
Customer.abc="abc"
console.log(Customer.abc)

console.log(customer.customerNumber)

class IndividualCustomer extends Customer{
    constructor(firstname, id, customerNumber){
        super(id,customerNumber)
        this.firstname = firstname
    }
}

class CorporateCustomer extends Customer{
    constructor(companyName, id, customerNumber){
        super(id,customerNumber)
        this.companyName = companyName
    }
}