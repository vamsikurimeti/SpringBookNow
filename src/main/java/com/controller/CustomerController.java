package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerservice;

//to register
	@PostMapping("/register")
	public Customer register(@RequestBody Customer customer) {
		return customerservice.register(customer);
	}

//to get all users
	@GetMapping("/getall")
	public List<Customer> getcustomers() {
		return customerservice.getcustomers();
	}

//to get all users based on first name
	@GetMapping("/getbyfirstname/{firstname}")
	public List<Customer> getcustomersbyfirstname(@PathVariable String firstname) {
		return customerservice.getcustomersbyfirstname(firstname);
	}

//to get all users based on last name
	@GetMapping("/getbylastname/{lastname}")
	public List<Customer> getcustomersbylastname(@PathVariable String lastname) {
		return customerservice.getcustomersbylastname(lastname);
	}

// to get all users based on state
	@GetMapping("/getbystate/{state}")
	public List<Customer> getcustomersbystate(@PathVariable String state) {
		return customerservice.getcustomersbystate(state);
	}

// to get all users based on country
	@GetMapping("/getbycountry/{country}")
	public List<Customer> getcustomersbycountry(@PathVariable String country) {
		return customerservice.getcustomersbycountry(country);
	}

// to get all users based on city
	@GetMapping("/getbycity/{city}")
	public List<Customer> getcustomersbycity(@PathVariable String city) {
		return customerservice.getcustomersbycity(city);
	}

// to get all users based on id
	@GetMapping("/getbyid/{id}")
	public Optional<Customer> getcustomersbyid(@PathVariable int id) {
		return customerservice.getcustomersbyid(id);
	}

//to update a customer
	@PutMapping("/updatecustomer")
	public Customer updatecustomer(@RequestBody Customer customer) {
		return customerservice.updatecustomer(customer);
	}

//to delete customer based on id
	@DeleteMapping("/deletecustomer/{id}")
	public int deletecustomer(@PathVariable int id) {
		return customerservice.deletecustomer(id);
	}

//to delete based on first name
	@DeleteMapping("/deletecustomerbyfname/{firstname}")
	public String deletecustomerbyfname(@PathVariable String firstname) {
		return customerservice.deletecustomerbyfname(firstname);
	}

// to delete customer by last name
	@DeleteMapping("/deletecustomerbylastname/{lastname}")
	public String deletecustomerbylastname(@PathVariable String lastname) {
		return customerservice.deletecustomerbylastname(lastname);
	}

// to delete customer based on city
	@DeleteMapping("/deletecustomerbycity/{city}")
	public String deletecustomerbycity(@PathVariable String city) {
		return customerservice.deletecustomerbycity(city);
	}

// to delete customer by last name
	@DeleteMapping("/deletecustomerbystate/{state}")
	public String deletecustomerbystate(@PathVariable String state) {
		return customerservice.deletecustomerbystate(state);
	}

// to delete customer by last name
	@DeleteMapping("/deletecustomerbycountry/{country}")
	public String deletecustomerbycountry(@PathVariable String country) {
		return customerservice.deletecustomerbycountry(country);
	}
	
}
