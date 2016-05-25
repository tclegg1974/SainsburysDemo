package com.example.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Product;
import com.example.dao.Results;

@Service
public class HTMLParserServiceImpl implements HTMLParserService {
	
	@Autowired
	private URLService urlService;
	
	private static String DemoURL = "http://hiring-tests.s3-website-eu-west-1.amazonaws.com/2015_Developer_Scrape/5_products.html";
	
	@Override
	public Results parseHTML() throws IOException {
		Results results = new Results();
		
		try {
			Document doc = Jsoup.connect(DemoURL).get();
			
			Elements elems = getProducts(doc);
			
			for(Element elem : elems) {
				Product prod = new Product.ProductBuilder()
						.title(getTitle(elem))
						.unit_price(Double.parseDouble(getPricePerUnit(elem)))
						.size(urlService.getHTMLSizeFromURL(getHrefURL(elem)))
						.build();
				
				results.add(prod);
				results.setTotal(results.getTotal() + prod.getUnit_price());
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw e;
		}
		return results;
	}
	
	private Elements getProducts(Document doc) {
		return doc.select("div.product");
	}
	
	private String getHrefURL(Element hrefs) {
		return hrefs.select("a[href]").attr("href");
	}
	
	private String getTitle(Element hrefs) {
		return hrefs.select("a[href]").get(0).ownText();
	}
	
	private String getPricePerUnit(Element elem) {
		String pricePerUnit = elem.select("p.priceperunit").get(0).text();
				
		return pricePerUnit.replaceAll("&pound", "").replaceAll("/unit", "");
	}

	

}
