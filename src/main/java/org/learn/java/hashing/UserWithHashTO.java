package org.learn.java.hashing;

/**
 * @author ecode
 *
 */
public class UserWithHashTO {

	
	public UserWithHashTO(String userName, String address, String phoneNo, int userId, boolean status){
		this.userName = userName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.userId = userId;
		this.status = status;
	}
	
	private String userName;
	private String address;
	private String phoneNo;
	private int userId;
	private boolean status;
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode(){
		final int random = 21;
		int mul = 3;
		int hashcode = 123;
		hashcode = random * mul + ( (userName == null) ? 0 : userName.hashCode() );
		return hashcode;
	}
	


	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		UserWithHashTO o = (UserWithHashTO) obj;
		if(address == null){
			if(o.address != null){
				return false;
			}
		}else if(!address.equals(o.address)){
			return false;
		}
		
		return true;
	}
	
	
	
}
