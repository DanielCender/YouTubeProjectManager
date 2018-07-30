package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Project;

@Stateless
@Local(ProjectBusinessInterface.class)
@Alternative
public class ProjectBusinessService implements ProjectBusinessInterface {
	
	List<Project> projects = new ArrayList<Project>();
	
	public ProjectBusinessService() {
		
		projects.add(new Project("Podcast", "Heat Gaming", "Scheduled", "7/24/18", "TrickeyDickey, Senshi10, Barron22"));
		projects.add(new Project("Let's Play", "Detriot episode 2", "Uploaded", "7/25/18", "TrickeyDickey, Senshi10, Barron22"));
		projects.add(new Project("Let's Play", "GTA V episode 1", "Recorded", "7/29/18", "TrickeyDickey, Senshi10, Barron22"));
		projects.add(new Project("Virtual Reviews", "Seeking Dawn", "Idea", "TBD", "TrickeyDickey"));
		projects.add(new Project("Stream", "Fortnite Fridays", "Thumbnail Done", "7/27/18", "Trickey Dickey, Senshi10"));
		
	}
	
	@Override
	public void addProject(Project project) {
		projects.add(project);
		
	}

	@Override
	public List<Project> getProjects() {
		return projects;
	}

	@Override
	public void setProjects(List<Project> projects) {
		this.projects = projects;
		
	}

	

}
