package com.github.dtrunk90.spring.data.solr.nested.repository;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import com.github.dtrunk90.spring.data.solr.nested.document.Product;

@Repository
public interface ProductRepository extends SolrCrudRepository<Product, String> {
}
