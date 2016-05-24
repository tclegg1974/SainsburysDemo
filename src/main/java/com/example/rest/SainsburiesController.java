package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.Results;
import com.example.services.HTMLParserService;

@RestController
public class SainsburiesController {

	@Autowired
	private HTMLParserService parser;
	
	@RequestMapping("/results")
	public Results getResults() {
		return parser.parseHTML();
	}
}
