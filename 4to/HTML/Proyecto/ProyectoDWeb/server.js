const express = require('express');
const router = require('./app/controllers/router');

const app = express();
const port = 3000;

app.use(express.json());
app.use(router);


app.use(express.static('app'));
app.use('/views', express.static('views'));


app.listen(port, () => {
<<<<<<< HEAD
    console.log("Aplicación corriendo en puerto " + port);
=======
    console.log("Aplicación de ejemplo corriendo en puerto " + port);
>>>>>>> 9b165b63264c8eae6d3be81585ba9bff1b14ad2a
});