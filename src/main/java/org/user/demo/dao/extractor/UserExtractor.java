package org.user.demo.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.user.demo.model.UserData;

@Component
public class UserExtractor implements ResultSetExtractor <UserData> {

	@Override
	public UserData extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		UserData ud= new UserData();
		
		if(rs.next())
		{
			ud.setUserid(rs.getInt("userid"));
			ud.setUsername(rs.getString("username"));
			ud.setEmail(rs.getString("email"));
			ud.setRoleid(rs.getInt("roleid"));
			ud.setMobileno(rs.getString("mobileno"));
			ud.setPass(rs.getString("pass"));
			ud.setHintquestion(rs.getString("hintquestion"));
			ud.setAnswer(rs.getString("answer"));
			ud.setStatus(rs.getString("status"));
		}
		return ud;
	}

}
