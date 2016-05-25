package com.example.services;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import com.example.dao.Results;

@RunWith( MockitoJUnitRunner.class )
public class HTMLParserServiceImplTest {

	@Mock
	private URLServiceImpl urlService;
	
	@InjectMocks
	private HTMLParserServiceImpl htmlService;
	
	@Test
	public void testParseHTML() throws IOException {
		Results results = htmlService.parseHTML();
		
		verify(urlService, times(7)).getHTMLSizeFromURL(anyString());
		
		assertEquals(7, results.getResults().size());
	}
	
	@Test(expected=IOException.class)
	public void testInvalidURLException() throws IOException {
		when(urlService.getHTMLSizeFromURL(anyString())).thenThrow(new IOException());
		
		Results results = htmlService.parseHTML();
	}
}
