package org.tnsindia.customexception;
// custom Exception For the Validating the Exception
public class LoginCredentials extends Exception {
	
	public String str;

	//constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}

}
