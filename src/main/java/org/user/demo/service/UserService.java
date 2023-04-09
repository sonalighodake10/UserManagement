package org.user.demo.service;

import java.util.List;

import org.user.demo.model.UserData;

public interface UserService {

	List<UserData> getUserListService();
	UserData getUserByUseridService(int userid);
	void insertUserService(UserData userData);
	void updateUserService(UserData userData);
	void deleteUserService(int userid);
}
