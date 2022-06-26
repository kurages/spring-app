package com.example.app.dto;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class UserDto{
	private String userId;
 	private String userName;

 	public String getUserId(){
 		return userId;
 	}

 	public void setUserId(String userId){
 		this.userId=userId;
 	}

 	public String getUserName(){
 		return userName;
 	}
 	public void setUserName(String userName){
 		this.userName=userName;
 	}
}
