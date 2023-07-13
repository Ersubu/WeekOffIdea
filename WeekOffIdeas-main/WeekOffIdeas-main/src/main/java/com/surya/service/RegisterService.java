package com.surya.service;

import java.util.List;

import com.surya.dto.RegistrationDto;
import com.surya.model.RegistrationForm;
import com.surya.userException.PasswordNotMatchException;
import com.surya.userException.UserExistException;

public interface RegisterService {

 public void deleteReg(Integer id);
 public RegistrationForm getOne(Integer id,String password);
 public List<RegistrationForm> getAll();
 public RegistrationForm update(RegistrationForm form);
 public  RegistrationForm saveRegister(RegistrationDto regDto) throws UserExistException, PasswordNotMatchException;

 public RegistrationForm saveRegister1(RegistrationDto regDto);

}
