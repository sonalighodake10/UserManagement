package org.user.demo.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.user.demo.dao.UserDao;
import org.user.demo.dao.extractor.UserExtractor;
import org.user.demo.dao.extractor.UserListExtractor;
import org.user.demo.model.UserData;

import lombok.AllArgsConstructor;


@Repository
@AllArgsConstructor
public class UserDaoImpl implements UserDao {
	
	private JdbcTemplate jdbcTemplate;
	private UserListExtractor userListExtractor;
	private UserExtractor userExtractor;

	@Override
	public List<UserData> getUserList() {
		List<UserData> userList=jdbcTemplate.query("select * from userdata order by userid",userListExtractor::extractData);
		return userList;
	}

	@Override
	public UserData getUserByUserid(int userid) {
		UserData ud=jdbcTemplate.query("select * from userdata where userid="+userid,userExtractor::extractData);
		return ud;
	}

	@Override
	public void insertUser(UserData userData) {
		String query= "insert into userdata values("+userData.getUserid()+",'"+userData.getUsername()+"','"+userData.getEmail()+"',"+userData.getRoleid()+",'"+userData.getMobileno()+"','"+userData.getPass()+"','"+userData.getHintquestion()+"','"+userData.getAnswer()+"','"+userData.getStatus()+"')";
		jdbcTemplate.update(query);
		
	}

	@Override
	public void updateUser(UserData userData) {
		String query="update userdata set username='"+userData.getUsername()+"', email='"+userData.getEmail()+"',roleid="+userData.getRoleid()+",mobileno='"+userData.getMobileno()+"',pass='"+userData.getPass()+"',hintquestion='"+userData.getHintquestion()+"',answer='"+userData.getAnswer()+"',status='"+userData.getStatus()+"'where userid="+userData.getUserid();
		jdbcTemplate.update(query);
		
	}

	@Override
	public void deleteUser(int userid) {
		String query="delete from userdata where userid="+userid;
		jdbcTemplate.update(query);
		
	}

}
