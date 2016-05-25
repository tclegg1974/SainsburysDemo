package com.example.services;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith( MockitoJUnitRunner.class )
public class URLServiceImplTest {

	private static String DemoURL = "http://hiring-tests.s3-website-eu-west-1.amazonaws.com/2015_Developer_Scrape/5_products.html";
	
	@InjectMocks
	private URLServiceImpl service;
	
	@Test
	public void testGetHTMLSizeFromURL() throws IOException {
		String size = service.getHTMLSizeFromURL(DemoURL);
		
		assertNotNull(size);
		assertTrue(size.contains("84.542kb"));
		
	}
	
	@Test(expected=IOException.class)
	public void testInvalidURL() throws IOException {
		String size = service.getHTMLSizeFromURL("https");
	}
}
