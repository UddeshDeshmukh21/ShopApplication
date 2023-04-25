## (Assignment No -1 mongoDB)

## db.emp.insert({empno:1,ename:'Kishor'});



## mongoimport --db dac23 --collection restaurent  --file 

## mongoimport --db dac23 --collection movie  --file 


## mongoimport --db dac23 --collection student  --file 

## db.restaurent.drop()


```MongoDB

1. Write a MongoDB query to display all the documents in the collection restaurants

> db.restaurent.find().pretty();


2. Write a MongoDB query to display the fields restaurant_id, name, borough and cuisine for
all the documents in the collection restaurant.

db.restaurent.find({},{restaurant_id:1,cuisine:1,borough:1,grades:0,address:0}).pretty()

```