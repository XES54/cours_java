package edu.cesi.demo.controller;

import edu.cesi.demo.dao.ProductDao;
import edu.cesi.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;


    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {

        Optional<Product> productOptional = productDao.findById(id);

        if(productOptional.isEmpty()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(productOptional.get(),HttpStatus.OK);
    }


    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> listProduct = productDao.findAll();
        return listProduct;
    }


    @DeleteMapping("/admin/product/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable int id) {

        Optional<Product> productOptional = productDao.findById(id);

        if(productOptional.isEmpty()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        productDao.deleteById(id);

        return new ResponseEntity<>(productOptional.get(),HttpStatus.OK);
    }


    @PostMapping("/admin/product")
    public ResponseEntity<Product> editProduct(@RequestBody Product product) {

        //si c'est une mise à jour (update)
        if(product.getId() !=null) {
            Optional<Product> productOptional = productDao.findById(product.getId());

            //si le produit n'existe pas, il s'agit d'une action non autoriséé
            //cad : affecté directement un id sans suivre l'auto-incrementation
            //ou editer un artile supprimé
            if(productOptional.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }

            productDao.save(product);
            return new ResponseEntity<>(productOptional.get(),HttpStatus.OK);
        }

        //si c'est création
        productDao.save(product);
        return new ResponseEntity<>(product,HttpStatus.CREATED);
    }

    @PostMapping("/manager/change-stock/{idProduct}/{quantity}")
    public ResponseEntity editProduct(@PathVariable int idProduct, @PathVariable int quantity) {
        Optional<Product> productOptional = productDao.findById(idProduct);

        if (productOptional.isPresent()) {
            Product product = productOptional.get();

            // si la quantité à modifier est positive ou si la quantité à supprimer est inférieur au stock
            // cad qu'il y est assez de stock à supprimer
            if (quantity > 0 || product.getQuantity() > -quantity) {

                product.setQuantity(product.getQuantity() + quantity);
                productDao.save(product);
            } else {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }

        }

        //si le produit n'existe pas
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}