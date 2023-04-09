package org.user.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
	
	private int userid;
	private String username;
	private String email;
	private int roleid;
	private String mobileno;
	private String pass;
	private String hintquestion;
	private String answer;
	private String status;

}
