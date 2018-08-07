package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean 
public class RegisterController {

	public RegisterController() {
		
	}
	
	public String onSubmit() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);	
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		return "RegisterConfirm.xhtml";
	}
	
}
