package com.springapp.example.learnspringapp.enterprise.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
 public class DataService {
	
	public List<Integer> getData() {
		return  Arrays.asList(20,20,30,40);
	}
}