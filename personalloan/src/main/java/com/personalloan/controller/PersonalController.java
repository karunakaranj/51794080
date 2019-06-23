package com.personalloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.personalloan.model.LoanDetails;
import com.personalloan.service.PersonalloanService;

@RestController
@RequestMapping("/personalloan")
public class PersonalController {

	@Autowired
	PersonalloanService personalloanservice;

	@PostMapping(value = "/save")
	public ResponseEntity<Object> createLoan(@RequestBody LoanDetails loanDetails, @RequestParam Long customerId) {
		return ResponseEntity.ok(PersonalloanService.createLoan(loanDetails, customerId));

	}

}
