package com.github.dtrunk90.spring.data.solr.nested.document;

import java.util.Collection;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.ChildDocument;
import org.springframework.data.solr.core.mapping.SolrDocument;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SolrDocument(collection = "collection1")
public class Product {

	@Field
	private String id;

	@Field
	private String name;

	@Field
	private boolean root;

	@ChildDocument
	private Collection<Product> variants;

}
