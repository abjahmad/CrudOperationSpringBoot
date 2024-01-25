package com.example.postservice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.val;

@Service
public class PostServiceImpl implements PostService{
	
	String baseUrl = "https://jsonplaceholder.typicode.com/";
	
	StringBuilder stringBuilder  = new StringBuilder(baseUrl);
	
	String POST = "/posts";
	
	@Autowired
	private RestTemplate  restTemplate;
	
	

	@Override
	public List<Map<String, Object>> getPosts() {
        HttpEntity <Void> httpEntity  = new HttpEntity<>(gethttpHeaders());
       String url = stringBuilder.append(POST).toString();
        val response  =  (val) restTemplate.exchange(url , HttpMethod.GET ,httpEntity,List.class); ;
        return  ((HttpEntity<List>) response).getBody();
    }
					
	
	private HttpHeaders	gethttpHeaders() {
		HttpHeaders  headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType((MediaType.APPLICATION_JSON));
		return headers;
		
	}
	
	
}
