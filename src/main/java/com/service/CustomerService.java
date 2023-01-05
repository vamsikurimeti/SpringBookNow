package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerrepository;

//for registering as a new user
	public Customer register(Customer customer) {
		customerrepository.save(customer);
		return customer;
	}

//to display all users in table
	public List<Customer> getcustomers() {
		return customerrepository.findAll();
	}

//to get by first name	
	public List<Customer> getcustomersbyfirstname(String firstname) {
		return customerrepository.findByfirstname(firstname);
	}

// to get by last name
	public List<Customer> getcustomersbylastname(String lastname) {
		return customerrepository.findBylastname(lastname);
	}

// to get by city
	public List<Customer> getcustomersbycity(String city) {
		return customerrepository.findBycity(city);
	}

// to get by state
	public List<Customer> getcustomersbystate(String state) {
		return customerrepository.findBystate(state);
	}

// to get by country
	public List<Customer> getcustomersbycountry(String country) {
		return customerrepository.findBycountry(country);
	}

// to get by id
	public Optional<Customer> getcustomersbyid(int id) {
		return customerrepository.findById(id);
	}

//to update details based on id
	public Customer updatecustomer(Customer customer) {
		return customerrepository.save(customer);
	}

//to delete customer based on id
	public int deletecustomer(int id) {
		customerrepository.deleteById(id);
		return id;
	}

//	to delete based on first name
	public String deletecustomerbyfname(String firstname) {
		customerrepository.deleteByfirstname(firstname);
		return firstname;
	}

//	to delete based on last name
	public String deletecustomerbylastname(String lastname) {
		customerrepository.deleteBylastname(lastname);
		return lastname;
	}

//	to delete based on city
	public String deletecustomerbycity(String city) {
		customerrepository.deleteBycity(city);
		return city;
	}

//	to delete based on state
	public String deletecustomerbystate(String state) {
		customerrepository.deleteBystate(state);
		return state;
	}

//	to delete based on country
	public String deletecustomerbycountry(String country) {
		customerrepository.deleteBycountry(country);
		return country;
	}
}
