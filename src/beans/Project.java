package beans;

//import java.util.ArrayList;

public class Project {
	String type, title, status, release, creators;
	//ArrayList<User> creators;
	//creators will eventually be a list of users in a latter version
	public Project(String type, String title, String status, String release, String users) {
		this.type = type;
		this.title = title;
		this.status = status;
		this.release = release;
		this.creators = users;
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

	
	
	

}
