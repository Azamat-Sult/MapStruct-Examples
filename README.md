# MapStruct-Examples

Postman endpoints & request bodies:

POST localhost:8080/mapper/getcustomer
````
{
"firstName": "firstName",
"lastName": "lastName",
"secondName": "secondName",
"age": 18
}
````

POST localhost:8080/mapper/getuser
````
{
"fullName": "firstName lastName secondName",
"years": 18
}
````

POST localhost:8080/mapper/getuserentity
````
{
"firstName": "firstName",
"lastName": "lastName",
"secondName": "secondName",
"age": 18
}
````