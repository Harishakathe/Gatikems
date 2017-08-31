package com.mindworx.service;

import java.util.List;

import com.mindworx.model.User;

public interface UserService {
	public List<User> getAll();
	public User getById(long id);	
	public boolean create(User user);
	public boolean update(User user);
	public User getByName(String name);
	public List<String> getUserRoles(String userName);
	public User registerNewUserAccount(User user) throws Exception;
}
