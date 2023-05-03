package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Product;

@Repository
public interface HRepository extends CrudRepository<Product, Integer> {

}
