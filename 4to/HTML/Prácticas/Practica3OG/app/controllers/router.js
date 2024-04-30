
const express = require('express');
const path = require('path');

const productRouter = require('../routes/products');
const adminProductRouter = require('../routes/admin_products');

const router = express.Router();

router.use('/products', productRouter);
router.use('/admin/products', validateAdmin, adminProductRouter);

router.get('/', (req, res) => res.sendFile(path.resolve(__dirname + "/../views/home.html")));
router.get('/home', (req, res) => res.sendFile(path.resolve(__dirname + "/../views/home.html")));
router.get('/shopping_cart', (req, res) => res.sendFile(path.resolve(__dirname + "/../views/shopping_cart.html")));

function validateAdmin (req, res, next){
    let auth = req.get('x-auth');
    if(auth == "admin"){ 
        console.log("Accediendo");
        next();
    }
    else{
        console.log("Acceso no autorizado, no se cuenta con privilegios de administrado");
        res.sendStatus(403);
    }

};

module.exports = router;