package com.github.dtrunk90.spring.data.solr.nested.document;

import java.util.Collection;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.ChildDocument;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@Getter
@Setter
@SolrDocument(collection = "collection1")
public class Product {

	@Id
	private String id;

	@Indexed("name_s")
	private String name;

	@Indexed("root_b")
	private boolean root;

	@ChildDocument
	private Collection<Product> variants;

}
