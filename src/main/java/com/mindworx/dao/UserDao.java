package com.mindworx.dao;

import java.util.List;

import com.mindworx.model.User;

public interface UserDao {
	public List<User> getAll();
	public User getById(long id);	
	public boolean create(User user);
	public boolean update(User user);
	public User getByName(String name);
	public User getByEmail(String email);
	public List<String> getUserRoles(String userName);
}
