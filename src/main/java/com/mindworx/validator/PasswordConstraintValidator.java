package com.mindworx.validator;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

@Component
public class PasswordConstraintValidator implements ConstraintValidator<ValidPassword, String> {

	private Pattern pattern;
	private Matcher matcher;
	//private static final String PATTERN = "((?=.*[0-9])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,16})";
	private static final String PATTERN ="(?=.*[0-9])(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9!@#$%^&*]{8,16}";
	@Override
	public void initialize(ValidPassword constraintAnnotation) {
	}

	private boolean validate(String password) {
	    pattern = Pattern.compile(PATTERN);
	    matcher = pattern.matcher(password);
	    return matcher.matches();
	}

	@Override
	public boolean isValid(String password, ConstraintValidatorContext arg1) {
		return validate(password);
	}

}