package business;

import java.util.List;

import javax.ejb.Local;

import beans.Project;

@Local
public interface ProjectBusinessInterface {
	
	public void addProject(Project project);
	public List<Project> getProjects();
	public void setProjects(List<Project> projects);
	
}
