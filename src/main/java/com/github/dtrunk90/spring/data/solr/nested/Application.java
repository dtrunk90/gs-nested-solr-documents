package com.github.dtrunk90.spring.data.solr.nested;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.solr.core.convert.SolrConverter;
import org.springframework.data.solr.core.convert.SolrJConverter;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public SolrConverter solrConverter() {
		return new SolrJConverter();
	}

}
