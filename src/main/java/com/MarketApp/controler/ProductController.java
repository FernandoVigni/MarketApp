package com.MarketApp.controler;

import com.MarketApp.entity.Product;
import com.MarketApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll(){
        List<Product> result = productService.getAll();
        return result;
    }

    @GetMapping("/{idProduct}")
    public Optional<Product> getByIDProduct(@PathVariable ("idProduct") int idProduct) {
        return productService.getByIDProduct(idProduct);
    }

    @GetMapping("/byCategory/{idCategory}")
    public List<Product> getByCategory(@PathVariable ("idCategory") int idCategory){
        return productService.getByCategory(idCategory);
    }
}
