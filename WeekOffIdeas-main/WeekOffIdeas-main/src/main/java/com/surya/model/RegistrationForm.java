package com.surya.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor(staticName ="Build")
@NoArgsConstructor
@Table(name="weekOfIdeaRegForm")
public class RegistrationForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private long mobile;
	private String email;
	private String password;
	@Transient
	private String confirm_Password;
	private String address;
	
	
	
	

}
