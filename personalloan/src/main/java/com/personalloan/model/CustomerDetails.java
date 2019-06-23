package com.personalloan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	private String name;
	
	private String mobile;

	private int dob;

	private String gender;

	private String martialStatus;

	private int creditScore;
	
	private int salary;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExpense() {
		return expense;
	}

	public void setExpense(int expense) {
		this.expense = expense;
	}

	private int expense;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	
	@OneToMany(mappedBy = "customerDetails", cascade = CascadeType.ALL)
	private List<LoanDetails> loanDetailsList;

	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}

	public List<LoanDetails> getLoanDetailsList() {
		return loanDetailsList;
	}

	public void setLoanDetailsList(List<LoanDetails> loanDetailsList) {
		this.loanDetailsList = loanDetailsList;
	}

	
	
	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", name=" + name + ", mobile=" + mobile + ", dob=" + dob
				+ ", gender=" + gender + ", martialStatus=" + martialStatus + ", creditScore=" + creditScore
				+ ", salary=" + salary + ", expense=" + expense + " loanDetailsList=" + loanDetailsList + "]";
	}

}
