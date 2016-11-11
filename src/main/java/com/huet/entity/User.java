package com.huet.entity;

public class User {
	
	   private String userCode;

	    private String userName;
  
	    private String userStatus ;
	     
	    
	    public String getUserStatus() {
			return userStatus;
		}

		public void setUserStatus(String userStatus) {
			this.userStatus = userStatus;
		}
  
	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName == null ? null : userName.trim();
	    }

		public String getUserCode() {
			return userCode;
		}

		public void setUserCode(String userCode) {
			this.userCode = userCode;
		}

	    
}
