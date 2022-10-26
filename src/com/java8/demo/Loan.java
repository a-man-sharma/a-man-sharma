package com.java8.demo;

public class Loan {

	private int accountNumber;
	private int accountBalance;
	private int salary;
	private String loanType;
	private int expectedLoanAmount;
	private int noOfEmi;
	private int eligibleLoanAmount;
	private int eligibleEmi;

	Loan(int accNo, int accBal, int sal, String loanType, int expLoanAmount, int noOfEmi) {
		if (accNo >= 1000 && accNo <= 9999) {
			if (accNo >= 1000 && accNo <= 1999) {
				if (accBal > 1000) {
					accountNumber = accNo;
					accountBalance = accBal;
					salary = sal;
					this.loanType = loanType;
					this.expectedLoanAmount = expLoanAmount;
					this.noOfEmi = noOfEmi;
					checkEligibility(loanType);
				} else {
					System.out.println("Mininum balance required is 1000");
				}
			} else {
				System.out.println("First digit of Account Number must be 1");
			}
		} else {
			System.out.println("Please enter 4 digit Account Number");

		}

	}

	public void checkEligibility(String loanType) {

		switch (loanType) {
		case "Car":
			if (salary > 25000 && expectedLoanAmount <= 500000 && noOfEmi <= 36) {
				eligibleLoanAmount = 500000;
				eligibleEmi = 36;
				System.out.println("Account number: " + accountNumber);
				System.out.println("Requested loan amount: " + expectedLoanAmount);
				System.out.println("Eligible Loan Amount: " + eligibleLoanAmount);
				System.out.println("Eligible EMI: " + eligibleEmi);
			} else {
				System.out.println("Sorry, you are not eligible for the Loan");
			}
			break;
		case "House":
			if (salary > 50000 && expectedLoanAmount <= 600000 && noOfEmi <= 60) {
				eligibleLoanAmount = 6000000;
				eligibleEmi = 60;
				System.out.println("Account number: " + accountNumber);
				System.out.println("Requested loan amount: " + expectedLoanAmount);
				System.out.println("Eligible Loan Amount: " + eligibleLoanAmount);
				System.out.println("Eligible EMI: " + eligibleEmi);
			} else {
				System.out.println("Sorry, you are not eligible for the Loan");
			}
			break;
		case "Business":
			if (salary > 75000 && expectedLoanAmount <= 7500000 && noOfEmi <= 84) {
				eligibleLoanAmount = 7500000;
				eligibleEmi = 84;
				System.out.println("Account number: " + accountNumber);
				System.out.println("Requested loan amount: " + expectedLoanAmount);
				System.out.println("Eligible Loan Amount: " + eligibleLoanAmount);
				System.out.println("Eligible EMI: " + eligibleEmi);
			} else {
				System.out.println("Sorry, you are not eligible for the Loan");
			}
			break;
		default:
			System.out.println("Please select the correct Loan type");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Loan(1001, 40000, 0000, "Car", 300000, 30);

	}

}
