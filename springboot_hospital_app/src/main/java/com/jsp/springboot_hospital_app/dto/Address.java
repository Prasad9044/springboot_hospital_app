package com.jsp.springboot_hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Data
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "City can't be blank")
	@NotNull(message = "City can't be null")
	private String city;
	@NotBlank(message = "State can't be blank")
	@NotNull(message = "State can't be null")
	private String state;
	@NotNull(message = "pincode can't be null")
	//@Pattern(regexp = "[4][0-9]{5}")
	private int pincode;

}
