
package pe.cibertec.ecommerce.ApiProduct.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiProduct.dao.ProductRepository;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
       return productRepository.findById(id).get();
    }

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        var productDB = productRepository.findById(product.getId()).get();
        productDB.setCategory(product.getCategory());
        productDB.setProductName(product.getProductName());
        productDB.setUnitPrice(product.getUnitPrice());
        return productRepository.save(productDB);
    }

    @Override
    public void delete(Long id) {
        var productDB = productRepository.findById(id).get();
        productRepository.delete(productDB);
    }
    
}
