package projects;

import projects.dao.DbConnection;

public class ProjectsApp {

	public static void main(String[] args) {
		// Entry point of the Projects application
		DbConnection.getConnection();

	}

}
