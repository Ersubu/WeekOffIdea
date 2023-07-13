package com.surya.dto;

import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class RegistrationDto {
	
	@Size(min=4,message="user name must be 4 char")
	@NotNull(message = "user name must not be empty")
	private String name;
	
	//@Pattern(regexp="^\\d{10}$",message = "invalid mobile no. entered")
	private long mobile;
	
	@NotNull
	@Email(message = "Email aadress is not valid")
	private String email;
	@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",message = " password should contains at least eight characters, including at least one number and includes both lower and uppercase letters and special characters ")
	private String password;
	
	private String confirm_Password;
	
	@NotNull(message = " Adress must not be emprty ")
	private String address;

}
