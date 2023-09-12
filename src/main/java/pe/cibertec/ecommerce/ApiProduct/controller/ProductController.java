
package pe.cibertec.ecommerce.ApiProduct.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;
import pe.cibertec.ecommerce.ApiProduct.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    
    //End Point
    @GetMapping("/findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }
    
    @GetMapping("/findById/{id}")
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }
    
    @PostMapping("/add")
    public Product add(@RequestBody Product product){
        return productService.add(product);
    }
    @PutMapping("/update")
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        productService.delete(id);
    }
}
