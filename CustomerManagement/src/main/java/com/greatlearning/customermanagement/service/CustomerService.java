package com.greatlearning.customermanagement.service;

import java.util.List;


import com.greatlearning.customermanagement.entity.Customer;

public interface CustomerService {
	List<Customer> listAll();

	Customer findById(int theId);

	void save(Customer thecustomer);

	void deleteById(int theId);
}
