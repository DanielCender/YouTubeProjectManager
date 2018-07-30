package beans;

import javax.faces.bean.ManagedBean;

//import java.util.ArrayList;

@ManagedBean
public class Project {
	String type = "Type of Content", title = "Title of Project", status = "Current Status of Project", release = "Projected release date", creators = "Creators Involved";
	//ArrayList<User> creators;
	//creators will eventually be a list of users in a latter version
	public Project() {
	}
	
	public Project(String type, String title, String status, String release, String users) {
		this.type = type;
		this.title = title;
		this.status = status;
		this.release = release;
		this.creators = users;
	}

	public Project(String[] split) {
		this.type = split[0];
		this.title = split[1];
		this.status = split[2];
		this.release = split[3];
		this.creators = split[4];
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getCreators() {
		return creators;
	}

	public void setCreators(String creators) {
		this.creators = creators;
	}

	@Override
	public String toString() {
		return type + ", " + title + ", " + status + ", " + release	+ ", " + creators;
	}

	
	
	

}
