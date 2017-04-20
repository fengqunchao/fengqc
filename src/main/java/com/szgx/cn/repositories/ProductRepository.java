package com.szgx.cn.repositories;
import com.szgx.cn.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
