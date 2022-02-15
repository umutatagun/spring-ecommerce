# Microservice Product 

### Endpoints : 

#### Save Product

`````
curl --location --request POST 'localhost:8080/api/product' \
--header 'Authorization: Basic Base64(username:password) \
--header 'Content-Type: application/json' \
--data-raw '{
"name" : "test_2",
"price" : 1.1
}
`````

#### Get Products
````
curl --location --request GET 'localhost:8080/api/product' \
--header 'Authorization: Basic (username: password)\
````

#### Delete Products

`````
curl --location --request DELETE 'localhost:8080/api/product/1' \
`````

