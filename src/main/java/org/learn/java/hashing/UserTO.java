package org.learn.java.hashing;

public class UserTO {

	public UserTO(String userName, String address, String phoneNo, String userId){
		this.userName = userName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.userId = userId;
	}
	
	private String userName;
	private String address;
	private String phoneNo;
	private String userId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
