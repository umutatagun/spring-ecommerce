package com.umut.ecommerce.service;

import com.umut.ecommerce.model.Product;
import com.umut.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product){
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

}
