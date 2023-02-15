# API CRUD hecha con Spring Boot & MongoDB

Tecnologias utilizadas:
- Java
- Spring Boot
- MongoDB
- Maven
- JPA
- POSTMAN

## Endpoints

GET
- Obtengo todos los futbolistas.
`http://localhost:8080/futbol/v1/futbolistas`

GET
- Obtengo un futbolista por ID- Obtengo todos los futbolistas.
`http://localhost:8080/futbol/v1/futbolistas/1`

POST
- Creo un nuevo futbolista.
`http://localhost:8080/futbol/v1/futbolistas`

`--data-raw '{
    "id": 1,
    "nombre": "Lionel",
    "apellido": "Messi",
    "telefono": 117788921,
    "equipo": "Barcelona"
}
}'`

PUT
- Edito un futbolista de la Base de Datos.
`http://localhost:8080/futbol/v1/futbolistas/1`

DELETE
- Elimino un futbolista de la Base de Datos.
`http://localhost:8080/futbol/v1/futbolistas/1`



