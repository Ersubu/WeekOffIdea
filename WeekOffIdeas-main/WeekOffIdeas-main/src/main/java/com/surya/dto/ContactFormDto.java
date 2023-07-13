package com.surya.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContactFormDto {
	
	
	@Size(min=4,message="user name must be 4 char")
	@NotNull(message = "user name must not be empty")
	private String name;
	
	@NotNull
	@Email(message = "Email aadress is not valid")
	private String email;
	
	@NotNull
	private String message;

}
