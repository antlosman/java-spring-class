package com.sda.javaee9spring.homeworkII;

import com.sda.javaee9spring.entity.PersonEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductEntity> readAllEntities() {
        log.info("trying to read all product entities");
        var result = productRepository.findAll();
        log.info("product entities read from database: {}", result);
        return result;
    }

    public ProductEntity readProductEntitiesById(Long id) {
        log.info("trying to read entity by id: [{}]", id);

        Optional<ProductEntity> maybeProduct = productRepository.findById(id);
        ProductEntity result = null;
        if (maybeProduct.isPresent()) {
            result = maybeProduct.get();
        }
        log.info("found Person entity: [{}]", result);
        return result;
    }


}
