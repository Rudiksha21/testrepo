package com.cg.studentmanagement1.service;

import java.util.List;

import com.cg.studentmanagement1.domain.Project;

/**
 * This ProjectService component will perform all the project related
 * requirements.
 * 
 * @author panka
 *
 */
public interface ProjectService {
	/**
	 * This createProject method will create the project in system
	 * 
	 * @param project to be created
	 */
	public void createProject(Project project);

	/**
	 * This listProject project method will return the list of projects if found.
	 * 
	 * @return list of project otherwise null
	 */
	public List<Project> listProjects();

	/**
	 * This updateProject method will update the provided project
	 * 
	 * @param project
	 */
	public void updateProject(Project project);

	/**
	 * This removeProject will remove the project from system based on id provided.
	 * 
	 * @param id
	 */
	public void removeProject(int id);

}
