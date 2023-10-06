package com.jsp.springboot_hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "name can't be blank")
	@NotNull(message = "name can't be null")
	private String name;
	@Email(regexp = "[a-z0-9.-_$%]+@[a-z0-9]+\\.[a-z]{2,3}", message = "Invalid Email")
	@NotBlank(message = "email can't be blank")
	private String email;
	@Min(value = 6000000000l)
	@Max(value = 9999999999l)
	private long phone;

}
