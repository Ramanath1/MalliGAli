package com.spring.curd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.curd.entity.CustomerEntity;
import com.spring.curd.repository.CustomerRepo;

@Service
public class CustomerService 
{
	@Autowired
	CustomerRepo CustomerRepo;
	
	public CustomerEntity saveCustomerDetails(CustomerEntity customer)
	{
		CustomerEntity save = CustomerRepo.save(customer);
		return save;
	}
	
	
	public Optional<CustomerEntity> findCustomerDetails(int customerId)
	{
		Optional<CustomerEntity> findById = CustomerRepo.findById(customerId);
		return findById;
	}
	
	public List<CustomerEntity> findAllDetails()
	{
		return CustomerRepo.findAll();
		
	}
	
}
