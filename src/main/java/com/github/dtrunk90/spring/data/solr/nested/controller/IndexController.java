package com.github.dtrunk90.spring.data.solr.nested.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.dtrunk90.spring.data.solr.nested.service.ProductService;

@Controller
@RequestMapping("/")
public class IndexController {

	@Autowired
	private ProductService productService;

	@RequestMapping
	public String getIndex(Model model) {
		model.addAttribute("products", productService.findAll());
		return "index";
	}

}
