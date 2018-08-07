package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

//import java.util.ArrayList;

@ManagedBean
@ViewScoped
public class Project {
	int id;
	String type = "Type of Content", title = "Title of Project", status = "Current Status of Project", release = "Projected release date", creators = "Creators Involved";
	//ArrayList<User> creators;
	//creators will eventually be a list of users in a latter version
	
	public Project() {
	}
	
	public Project(int id, String type, String title, String status, String release, String users) {
		this.id = id;
		this.type = type;
		this.title = title;
		this.status = status;
		this.release = release;
		this.creators = users;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
