package com.mindworx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindworx.dao.UserDao;
import com.mindworx.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getAll() {
		return null;
	}

	@Override
	public User getById(long id) {
		return null;
	}

	@Override
	public boolean create(User user) {
		if (usernameExist(user.getUsername())) {   
            try {
				throw new Exception(
				  "There is an account with that Username :"+ user.getUsername());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		return userDao.create(user);
	}
	
	
	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getByName(String name) {
		return userDao.getByName(name);
	}

	@Override
	public List<String> getUserRoles(String userName) {
		return userDao.getUserRoles(userName);
	}

	@Override
	public User registerNewUserAccount(User fuser) throws Exception {
		if (usernameExist(fuser.getUsername())) {
            throw new Exception("There is an account with that UserName : " + fuser.getUsername());
        }
        userDao.create(fuser);
        return fuser;
	}
	
	private boolean emailExist(final String email) {
        return userDao.getByEmail(email) != null;
    }
	private boolean usernameExist(final String username) {
        return userDao.getByName(username) != null;
    }


}
