package org.user.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.user.demo.dao.UserDao;
import org.user.demo.model.UserData;
import org.user.demo.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	 private UserDao userDao;
	@Override
	public List<UserData> getUserListService() {
		List<UserData> userList= userDao.getUserList();
		return userList;
	}
	@Override
	public UserData getUserByUseridService(int userid) {
		UserData ud= userDao.getUserByUserid(userid);
		return ud;
	}
	@Override
	public void insertUserService(UserData userData) {
		userDao.insertUser(userData);
		
	}
	@Override
	public void updateUserService(UserData userData) {
		userDao.updateUser(userData);
	}
	@Override
	public void deleteUserService(int userid) {
		userDao.deleteUser(userid);
	}

}
