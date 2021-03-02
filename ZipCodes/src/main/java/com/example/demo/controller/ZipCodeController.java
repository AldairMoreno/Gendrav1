package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ZipCodeEntity;
import com.example.demo.service.ZipCodeService;

@RestController
@RequestMapping("/zip/v1")
public class ZipCodeController {

	@Autowired
	ZipCodeService zipcodeService;

	@GetMapping(path = "/zip_code", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ZipCodeEntity>> findAll() {

		List<ZipCodeEntity> list = zipcodeService.findAll();

		return ResponseEntity.ok().cacheControl(CacheControl.noCache()).body(list);
	}

	@GetMapping(path = "/zip_code/{zip_code}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ZipCodeEntity> findEntity(@PathVariable("zip_code") int zip_code) {
		ZipCodeEntity zipcode = zipcodeService.findByZipCode(zip_code);

		if (zipcode == null) {
			return ResponseEntity.ok(null);
		} else {
			return ResponseEntity.ok(zipcode);
		}

	}

}
