package com.example.postservice;

import java.util.List;
import java.util.Map;

public interface PostService {
	
	List<Map<String, Object>> getPosts();
	
}
