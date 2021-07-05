package com.cg.studentmanagement1.dao;

import java.util.List;

import com.cg.studentmanagement1.domain.Project;

/**
 * This will perform all the CRUD Operations on Project
 * @author panka
 *
 */
public interface ProjectDAO {

	/**
	 * This save method will save the provided project
	 * @param project to be saved
	 */
	public void save(Project project);
	/**
	 * This findAll method will return the projects
	 * @return list of projects if found otherwise null
	 */
	public List<Project> findAll();
	/**
	 * This update method will change the project detail as provided in project object
	 * @param project to be updated
	 */
	public void update(Project project);
	/**
	 * This delete method will remove the project from DB based on id provided
	 * @param id to the project to be removed
	 */
	public void delete(int id);
}