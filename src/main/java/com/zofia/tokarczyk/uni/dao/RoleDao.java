package com.zofia.tokarczyk.uni.dao;


import com.zofia.tokarczyk.uni.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
