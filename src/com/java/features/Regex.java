package com.java.features;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public boolean validateMobileNumber(String mobileNumber) {
		Pattern regex = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Matcher mobileMatcher = regex.matcher(mobileNumber);
		return mobileMatcher.matches();
	}

	public static void main(String[] args) {
		Regex object = new Regex();
		System.out.println(object.validateMobileNumber("111-222-3333"));
	}
}
