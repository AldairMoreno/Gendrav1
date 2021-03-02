package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ZipCodeEntity;
import com.example.demo.repository.ZipCodeRepository;

@Service
public class ZipCodeService {
	
	@Autowired
	ZipCodeRepository zipcoderepository;
	
	public List<ZipCodeEntity> findAll(){
		return zipcoderepository.findAll();
	}
	
	public ZipCodeEntity findByZipCode(int zip_code) {
		return zipcoderepository.findByZipCode(zip_code);
	}
	
}
