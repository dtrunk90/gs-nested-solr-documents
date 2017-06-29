package com.github.dtrunk90.spring.data.solr.nested.service;

import com.github.dtrunk90.spring.data.solr.nested.document.Product;

public interface ProductService {

	public Iterable<Product> findAll();

	public Iterable<Product> save();

}
