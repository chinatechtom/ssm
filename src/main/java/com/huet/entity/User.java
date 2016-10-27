package com.huet.entity;

public class User {
	
	 private String userId;

	    private String userName;
 
	    private Double userSalary;

	    private String userStatus ;
	    
	    
	    
	    public String getUserStatus() {
			return userStatus;
		}

		public void setUserStatus(String userStatus) {
			this.userStatus = userStatus;
		}

		public String getUserId() {
	        return userId;
	    }

	    public void setUserId(String userId) {
	        this.userId = userId == null ? null : userId.trim();
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName == null ? null : userName.trim();
	    }

	    public Double getUserSalary() {
	        return userSalary;
	    }

	    public void setUserSalary(Double userSalary) {
	        this.userSalary = userSalary;
	    }
}
