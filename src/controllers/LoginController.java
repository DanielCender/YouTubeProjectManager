package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.User;
import business.ProjectBusinessInterface;

@ManagedBean
public class LoginController {
	
	@Inject
	ProjectBusinessInterface services;
	
	public LoginController() {
		
	}
	
	public String onSubmit() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		return "Main.xhtml";
	}
	
	public ProjectBusinessInterface getService() {
		
		return services;
	}
	
}
