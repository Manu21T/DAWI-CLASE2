
package pe.cibertec.ecommerce.ApiProduct.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;


public interface ProductService {
    public List<Product> findAll();
    public Product findById(Long id);
    public Product add(Product product);
    public Product update(Product product);
    public void delete(Long id);
}
