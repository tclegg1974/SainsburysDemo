package com.example.services;

import com.example.dao.Results;

public interface HTMLParserService {
	public void setHTMLToParse(String html);
	public Results parseHTML();
}
