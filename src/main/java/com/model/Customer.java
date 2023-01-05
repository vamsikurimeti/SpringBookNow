package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String dateofbirth;
	private String password;
	private String city;
	private String state;
	private String country;
}
