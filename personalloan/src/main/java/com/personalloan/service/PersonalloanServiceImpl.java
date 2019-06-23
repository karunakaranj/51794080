package com.personalloan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalloan.model.CustomerDetails;
import com.personalloan.repository.CustomerRepository;
import com.personalloan.repository.LoanRepository;

@Service
	public class PersonalloanServiceImpl implements PersonalloanService {

		@Autowired
		CustomerRepository customerRepository;

		@Autowired
		LoanRepository loanRepository;
		
	/*
	 * public String createLoan(LoanDetails loanDetails, Long customerId) { try {
	 * Optional<CustomerDetails> customer =
	 * customerRepository.findByCustomerId(customerId); if (customer.isPresent()) {
	 * CustomerDetails customerDetails = new CustomerDetails();
	 * customerDetails.setCustomerId(customerId);
	 * loanDetails.setCustomerDetails(customerDetails);
	 * loanRepository.save(loanDetails); return "created  success"; } else { return
	 * null; }
	 */




		
		

		


}
