package com.szgx.cn.services;

import com.szgx.cn.domain.Product;
import com.szgx.cn.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        Optional<Product> productOptional = productRepository.findOne(id);
        if (productOptional.isPresent()) {
            return productOptional.get();
        }
        return null;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
