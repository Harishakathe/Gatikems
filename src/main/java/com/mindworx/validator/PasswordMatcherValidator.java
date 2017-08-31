package com.mindworx.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.mindworx.model.User;

@Component
public class PasswordMatcherValidator implements ConstraintValidator<PasswordMatches, Object>{

	@Override
	public void initialize(PasswordMatches arg0) {		
	}

	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext arg1) {
		User user = (User) obj;
        return user.getPassword().equals(user.getMatchingPassword());
	}

}
