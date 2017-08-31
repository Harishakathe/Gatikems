package com.mindworx.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mindworx.dao.UserDao;
import com.mindworx.model.User;

@Service(value="loginService")
public class LoginService implements UserDetailsService  {
	
	@Autowired
    private UserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.getByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }        
        List<String> roles= userDao.getUserRoles(username);
        List<GrantedAuthority> grantList= new ArrayList<GrantedAuthority>();
        if(roles!= null)  {
            for(String role: roles)  {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(role);
                grantList.add(authority);
            }
        }      
        UserDetails userDetails = (UserDetails) new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantList);
        return userDetails;
	}

}
