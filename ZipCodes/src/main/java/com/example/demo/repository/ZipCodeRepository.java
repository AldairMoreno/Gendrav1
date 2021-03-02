package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.ZipCodeEntity;

@Repository
public interface ZipCodeRepository extends JpaRepository<ZipCodeEntity, Integer> {
	
	@Query("SELECT z FROM ZipCodeEntity z WHERE z.zip_code= ?1")
	ZipCodeEntity findByZipCode(int zip_code); 

}
