package com.jsp.springboot_hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "name can't be blank")
	@NotNull(message = "name can't be null")
	private String name;
	@NotBlank(message = "email is mandatory")
	@Email(regexp = "[a-z0-9.-_$%]+@[a-z0-9]+\\.[a-z]{2,3}", message = "Invalid Email")
	private String email;
	@NotBlank(message = "gst is mandatory")
	private String gst;

}
