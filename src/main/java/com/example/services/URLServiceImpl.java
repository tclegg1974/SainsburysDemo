package com.example.services;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

@Service
public class URLServiceImpl implements URLService {

	@Override
	public String getHTMLSizeFromURL(String URLToSize) {
		HttpURLConnection content = null;
		try {
			content = (HttpURLConnection) new URL(URLToSize).openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Double contentLength = ((double)content.getContentLength()) / 1000;
		return Double.toString(contentLength)+"kb";
	}

}
