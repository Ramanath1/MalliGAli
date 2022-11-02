package com.spring.curd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.curd.entity.CustomerEntity;
import com.spring.curd.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CutomerController 
{
	@Autowired
	CustomerService customerService;

	@RequestMapping(value="/save",method = RequestMethod.POST)
	public CustomerEntity saveDetails(@RequestBody CustomerEntity cus)
	{
		return customerService.saveCustomerDetails(cus);
	}
	
	
	@RequestMapping(value="/findbyID/{customerId}",method = RequestMethod.GET)
	public Optional<CustomerEntity> findDetails(@PathVariable int customerId)
	{
		return customerService.findCustomerDetails(customerId);
	}
	
	@RequestMapping(value="/findAll",method = RequestMethod.GET)
	public List <CustomerEntity> findAll()
	{
		return customerService.findAllDetails();
	}
	
}

//entity-> repository -> service -> controller-> main