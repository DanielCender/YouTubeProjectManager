package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Project;
import business.ProjectBusinessInterface;

@ManagedBean
public class ProjectController {
	
	@Inject
	ProjectBusinessInterface services;
	
	public String onSubmit() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		Project project = context.getApplication().evaluateExpressionGet(context, "#{project}", Project.class);	
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("project", project);
		
		services.addProject(new Project(project.toString().split(", ")));
		
		return "Main.xhtml";
	}
}
