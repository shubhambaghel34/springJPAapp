package com.springapp.example.learnspringapp.enterprise;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springapp.example.learnspringapp.enterprise.business.BusinessService;


@Component
public class mywebcontroller {

	//auto-writing of business class
	@Autowired 
	private BusinessService businessService;
    
	public long retrunBusinessValue() {
    	return businessService.calculateSum();
    }
	
//	public long retrunBusinessValue() {
//		return 400;
//	}
	

	
}


//
//@Component
//class BusinessService {
//	
//	//auto-wiring database service class
//	
//	@Autowired
//	private DataService dataService;
//	
//	public long calculateSum() {
//		List<Integer> dataset=dataService.getData();
//		return dataset.stream().reduce(Integer::sum).get();
//	}
//}
//
//
//@Component
// class DataService {
//	
//	public List<Integer> getData() {
//		return  Arrays.asList(10,20,30,40);
//	}
//}