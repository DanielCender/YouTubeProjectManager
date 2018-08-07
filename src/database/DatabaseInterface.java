package database;

import java.util.ArrayList;

import javax.ejb.Local;

import beans.Project;

@Local
public interface DatabaseInterface {
	public int deleteOne(int d);
	public int insertOne(Project b);
	public ArrayList<Project> readAll();
	public int updateOne(int d, Project b);
}
