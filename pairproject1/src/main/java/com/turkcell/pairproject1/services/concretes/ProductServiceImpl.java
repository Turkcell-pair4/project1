package com.turkcell.pairproject1.services.concretes;

import com.turkcell.pairproject1.core.exception.types.BusinessException;
import com.turkcell.pairproject1.dtos.requests.ProductRequests.ProductSaveRequest;
import com.turkcell.pairproject1.dtos.requests.ProductRequests.ProductUpdateRequest;
import com.turkcell.pairproject1.entities.Product;
import com.turkcell.pairproject1.mappers.ProductMapper;
import com.turkcell.pairproject1.repositories.ProductRepository;
import com.turkcell.pairproject1.services.abstracts.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ResourceBundleMessageSource messageSource;



    @Override
    public Product findById(int id) {
        Optional<Product> productOptional = productRepository.findById(id);

        if(productOptional.isEmpty()) {
            throw new RuntimeException("Product with id " + id + " does not exist");
        }


        return productOptional.get();
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = productRepository.findAll();

        if(products.isEmpty()) {
            throw new RuntimeException("There are no products");
        }

        return products;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(int id, Product product) {
        Optional<Product> productOptional = productRepository.findById(id);

        if(productOptional.isEmpty()) {
            throw new RuntimeException("Product with id " + id + " does not exist");
        }

        Product productToUpdate = productOptional.get();
        productToUpdate = productRepository.save(product);

        return productToUpdate;
    }

    @Override
    public void delete(int id) {
        Optional<Product> productOptional = productRepository.findById(id);
        if(productOptional.isEmpty()) {
            throw new RuntimeException("Product with id " + id + " does not exist");
        }

        productRepository.delete(productOptional.get());
    }





}
