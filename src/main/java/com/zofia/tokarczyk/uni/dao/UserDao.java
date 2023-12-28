package com.zofia.tokarczyk.uni.dao;


import com.zofia.tokarczyk.uni.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
