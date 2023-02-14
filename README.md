# API CRUD hecha con Spring Boot & MongoDB

Tecnologias utilizadas:
- Java
- Spring Boot
- MongoDB
- Maven
- JPA
- POSTMAN

## Servicios

GET

`http://localhost:8092/customers`

POST

`http://localhost:8092/customers`

`--data-raw '{
    "numberID": "32404590",
    "firstName": "Axel",
    "lastName": "Cespedes",
    "email": "adcespedes@argentina.com",
    "photoUrl": "",
    "region": {
        "id": 2,
        "name": "Centroamerica"
    }
}'`

**Product**

GET

`http://localhost:8091/products`

POST

`http://localhost:8091/products`

`--data-raw '{
    "name": "Libro del Rey Tigre",
    "description": "Demasiado bueno el Libro",
    "stock": 70,
    "price": 1000,
    "category": {
        "id": 2,
        "name": "books"
    }
}'`

**Shopping**

GET

`http://localhost:8093/invoices`

POST

`http://localhost:8093/invoices`

`--data-raw '{
    "numberInvoice": "002",
        "description": "Invoice store",
        "customerId": 2,
        "items": [
            {
                "quantity": 1,
                "price": 178.89,
                "productId": 1
            },
            {
                "quantity": 2,
                "price": 40.06,
                "productId": 3
            }
        ]
}'`

