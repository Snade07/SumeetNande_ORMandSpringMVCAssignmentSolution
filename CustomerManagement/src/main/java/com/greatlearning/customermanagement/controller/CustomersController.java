package com.greatlearning.customermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.customermanagement.entity.Customer;

import com.greatlearning.customermanagement.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomersController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	// /customers/list	
	// @RequestMapping("/customers/list")
	// Option 2 - for declaring request mapping
	public String handleListCustomerss(Model theModel) {

		List<Customer> customers = customerService.listAll();

		theModel.addAttribute("customers", customers);

		return "customers-lister";
	}

}
