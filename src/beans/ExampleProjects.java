package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ExampleProjects {
	List<Project> example = new ArrayList<Project>();
	
	public ExampleProjects () {
		example.add(new Project("Podcast", "Heat Gaming", "Scheduled", "7/24/18", "TrickeyDickey, Senshi10, Barron22"));
		example.add(new Project("Let's Play", "Detriot episode 2", "Uploaded", "7/25/18", "TrickeyDickey, Senshi10, Barron22"));
		example.add(new Project("Let's Play", "GTA V episode 1", "Recorded", "7/29/18", "TrickeyDickey, Senshi10, Barron22"));
		example.add(new Project("Virtual Reviews", "Seeking Dawn", "Idea", "TBD", "TrickeyDickey"));
		example.add(new Project("Stream", "Fortnite Fridays", "Thumbnail Done", "7/27/18", "Trickey Dickey, Senshi10"));
		
	}

	public List<Project> getExample() {
		return example;
	}

	public void setExample(List<Project> example) {
		this.example = example;
	}
	
	
}
