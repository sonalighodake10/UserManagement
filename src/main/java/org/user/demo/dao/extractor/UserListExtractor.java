package org.user.demo.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.user.demo.model.UserData;


@Component
public class UserListExtractor  implements ResultSetExtractor <List<UserData>>{

	@Override
	public List<UserData> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		ArrayList<UserData> userList= new ArrayList<UserData>();
		UserData ud	= null;
		
		while(rs.next()) {
			
			ud= new UserData();
			ud.setUserid(rs.getInt("userid"));
			ud.setUsername(rs.getString("username"));
			ud.setEmail(rs.getString("email"));
			ud.setRoleid(rs.getInt("roleid"));
			ud.setMobileno(rs.getString("mobileno"));
			ud.setPass(rs.getString("pass"));
			ud.setHintquestion(rs.getString("hintquestion"));
			ud.setAnswer(rs.getString("answer"));
			ud.setStatus(rs.getString("status"));
			
			userList.add(ud);
		}
		return userList;
	}

}
