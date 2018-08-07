package controllers;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Project;
import business.ProjectBusinessInterface;

@ManagedBean
public class ProjectController {
	
	@Inject
	ProjectBusinessInterface services;
	
	public ProjectController() {
		
	}
	
	public String onSubmit() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		
		Project project = context.getApplication().evaluateExpressionGet(context, "#{project}", Project.class);	
		
		services.insertOne(project);
		
		return "Main.xhtml";
	}
	
	public ArrayList<Project> fetchAll() {
		return services.readAll();
	}
	
	public String onDelete(Project project) {
		
		services.deleteOne(project.getId());
		
		return "Main.xhtml";
	}
	
	public String onEdit(Project project) {
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("project", project);
		
		return "EditProject.xhtml";
		
	}
	
	public String onSubmitEdit() {
		FacesContext context = FacesContext.getCurrentInstance();
		
		Project project = context.getApplication().evaluateExpressionGet(context, "#{project}", Project.class);	
		
		services.updateOne(project.getId(), project);
		
		return "Main.xhtml";
	}
	
	
	
}
