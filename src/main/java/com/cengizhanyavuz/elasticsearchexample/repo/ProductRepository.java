package com.cengizhanyavuz.elasticsearchexample.repo;


import com.cengizhanyavuz.elasticsearchexample.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product,Integer> {
}