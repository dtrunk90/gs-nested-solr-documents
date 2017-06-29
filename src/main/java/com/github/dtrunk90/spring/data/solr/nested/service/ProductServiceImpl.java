package com.github.dtrunk90.spring.data.solr.nested.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.github.dtrunk90.spring.data.solr.nested.document.Product;
import com.github.dtrunk90.spring.data.solr.nested.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public Iterable<Product> findAll() {
		return repository.findAll();
	}

	@Override
	@Scheduled(initialDelay = 0, fixedRate = Long.MAX_VALUE)
	public Iterable<Product> save() {
		repository.deleteAll();

		List<Product> productList = new LinkedList<Product>();
		List<Product> p1Variants = new LinkedList<Product>();

		Product p1 = new Product();
		p1.setId("1234");
		p1.setName("Product 1234");
		p1.setVariants(p1Variants);
		productList.add(p1);

		Product p1Variant1 = new Product();
		p1Variant1.setId("1234-red");
		p1Variant1.setName("Product 1234 red");
		p1Variants.add(p1Variant1);

		Product p1Variant2 = new Product();
		p1Variant2.setId("1234-green");
		p1Variant2.setName("Product 1234 green");
		p1Variants.add(p1Variant2);

		Product p1Variant3 = new Product();
		p1Variant3.setId("1234-blue");
		p1Variant3.setName("Product 1234 blue");
		p1Variants.add(p1Variant3);

		Product p2 = new Product();
		p2.setId("5678");
		p2.setName("Product 5678");
		productList.add(p2);

		return repository.saveAll(productList);
	}

}
