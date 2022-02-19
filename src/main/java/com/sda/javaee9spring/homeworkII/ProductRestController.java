package com.sda.javaee9spring.homeworkII;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/product-api/")
public class ProductRestController {

    private final ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("products")
    public List<ProductEntity> findAllProducts() {
        log.info("findAllProducts");
        return productService.readAllEntities();
    }

    public ProductEntity findProductEntityById(@PathVariable("id") Long productId) {
        log.info("trying to find product entity by id: [{}]");
        return productService.readProductEntitiesById(productId);
    }
}
