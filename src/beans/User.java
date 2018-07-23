package beans;

import javax.faces.bean.ManagedBean;
import javax.validation.constraints.Size;

@ManagedBean
public class User {
	
	@Size(min=4, max=30)
	private String firstName, lastName, email, userName, password;
	@Size(min=10, max=10)
	private String phone;
	
	public User() {
		firstName="First";
		lastName="Last";
		email="fake@email.com";
		userName="User";
		password="Pass";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
