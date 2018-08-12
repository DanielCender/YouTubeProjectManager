package business;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import beans.Project;

@RequestScoped
@Path("/things")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class ThingsRestService {

	@Inject
	ProjectBusinessInterface bs;
	
	//get all records and display in JSON
	@GET
	@Path("/getjson")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Project> getAllThingsAsJson() {
		return bs.readAll();
	}
	
	@GET
	@Path("/getjsonbyid/{thingnumber}/")
	@Produces(MediaType.APPLICATION_JSON)
	public Project getThingById(@PathParam("thingnumber") int thingnumber) {
		return bs.getThingById(thingnumber);
	}
	
	@GET
	@Path("/getjsonbyname/{searchname}/")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Project> searchByName(@PathParam("searchname") String searchname) {
		return bs.searchByName(searchname);
	}
	
	@GET
	@Path("/getxml")
	@Produces(MediaType.APPLICATION_XML)
	public Project[] getAllThingsAsXML() {
		List<Project> things = bs.readAll();
		return things.toArray(new Project[things.size()]);
	}
}
