package org.user.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.user.demo.model.UserData;
import org.user.demo.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "userdata")
@CrossOrigin
public class UserController {
	
	private UserService userService;
	
	@GetMapping
	public List<UserData> getUserListCtrl()
	{
		List<UserData> userList= userService.getUserListService();
		return userList;
	}
	
	@GetMapping("/{unum}")
	public UserData getUserByUseridCtrl(@PathVariable(value="unum") int userid)
	{
		UserData ud= userService.getUserByUseridService(userid);
		return ud;
    }
	
	@PostMapping
	public void insertUserCtrl(@RequestBody UserData userData)
	{
		userService.insertUserService(userData);
	}
	
	@PutMapping
	public void updateUserCtrl(@RequestBody UserData userData)
	{
		userService.updateUserService(userData);
	}
	
	@DeleteMapping("/{unum}")
	public void deleteUserCtrl(@PathVariable(value="unum") int userid)
	{
		userService.deleteUserService(userid);
	}

}
