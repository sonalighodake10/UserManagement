package org.user.demo.dao;

import java.util.List;

import org.user.demo.model.UserData;

public interface UserDao {

	
	List <UserData> getUserList();
	UserData getUserByUserid(int userid);
	void insertUser(UserData userData);
	void updateUser(UserData userData);
	void deleteUser(int userid);
}
