package com.github.dtrunk90.spring.data.solr.nested.document;

import java.util.Collection;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SolrDocument(solrCoreName = "collection1")
public class Product {

	@Field
	private String id;

	@Field
	private String name;

	@Field(child = true)
	private Collection<Product> variants;

	public boolean isVariant() {
		if (variants == null || variants.isEmpty()) {
			return true;
		}

		return false;
	}

}
