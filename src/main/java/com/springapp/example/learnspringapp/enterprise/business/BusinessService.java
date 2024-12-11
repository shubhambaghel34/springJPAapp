package com.springapp.example.learnspringapp.enterprise.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.springapp.example.learnspringapp.enterprise.data.DataService;


@Component
public class BusinessService {
	
	//auto-wiring database service class
	
	@Autowired
	private DataService dataService;
	
	public long calculateSum() {
		List<Integer> dataset=dataService.getData();
		return dataset.stream().reduce(Integer::sum).get();
	}
}

