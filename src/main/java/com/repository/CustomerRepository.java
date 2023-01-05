package com.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Transactional
	String deleteByfirstname(String firstname);

	@Transactional
	String deleteBylastname(String lastname);

	@Transactional
	String deleteBycity(String city);

	@Transactional
	String deleteBystate(String state);

	@Transactional
	String deleteBycountry(String country);

	@Transactional
	List<Customer> findByfirstname(String firstname);

	@Transactional
	List<Customer> findBylastname(String lastname);

	@Transactional
	List<Customer> findBycity(String city);

	@Transactional
	List<Customer> findBystate(String state);

	@Transactional
	List<Customer> findBycountry(String country);

}