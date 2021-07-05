package com.cg.studentmanagement1.serviceimpl;

import java.util.List;

import com.cg.studentmanagement1.dao.ProjectDAO;
import com.cg.studentmanagement1.daoimpl.*;
import com.cg.studentmanagement1.domain.Project;
import com.cg.studentmanagement1.service.ProjectService;

public class ProjectServiceImpl implements ProjectService {
	
	private ProjectDAO projectDAO;
	
	public ProjectServiceImpl() {
		projectDAO=new ProjectDAOImpl();
	}

	@Override
	public void createProject(Project project) {
		projectDAO.save(project);

	}

	@Override
	public List<Project> listProjects() {
		
		return projectDAO.findAll();
	}

	@Override
	public void updateProject(Project project) {
		// projectDAO.update(project);

	}

	@Override
	public void removeProject(int id) {
		// projectDAO.delete(id);
		projectDAO.delete(id);

	}

}
