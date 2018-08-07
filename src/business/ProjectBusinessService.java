package business;

import java.util.ArrayList;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import beans.Project;
import database.DatabaseInterface;

@Stateless
@Local
@Alternative
public class ProjectBusinessService implements ProjectBusinessInterface {

	
	@Inject
	DatabaseInterface db;
	
	@Override
	public int deleteOne(int d) {
		return db.deleteOne(d);
	}

	@Override
	public int insertOne(Project b) {
		return db.insertOne(b);
	}

	@Override
	public ArrayList<Project> readAll() {
		return db.readAll();
	}

	@Override
	public int updateOne(int d, Project b) {
		return db.updateOne(d, b);
	}	
	

}
