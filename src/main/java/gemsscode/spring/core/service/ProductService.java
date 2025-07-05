package gemsscode.spring.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import gemsscode.spring.core.repository.ProductRepopository;
import lombok.Getter;

// @Scope("prototype")
// @Lazy
@Component
public class ProductService {

    @Getter
    private ProductRepopository productRepopository;

    @Autowired
    public ProductService(ProductRepopository productRepopository) {
        this.productRepopository = productRepopository;
    }

    public ProductService(ProductRepopository productRepopository, String name) {
        this.productRepopository = productRepopository;
    }

}