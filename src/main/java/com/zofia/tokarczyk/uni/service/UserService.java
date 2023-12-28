package com.zofia.tokarczyk.uni.service;


import com.zofia.tokarczyk.uni.entity.User;
import com.zofia.tokarczyk.uni.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	void save(WebUser webUser);

}
