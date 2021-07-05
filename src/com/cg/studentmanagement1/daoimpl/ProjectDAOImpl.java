package com.cg.studentmanagement1.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.studentmanagement1.dao.ProjectDAO;
import com.cg.studentmanagement1.domain.Project;
import com.cg.studentmanagement1.util.DBUtil;

public class ProjectDAOImpl extends DBUtil implements ProjectDAO {
	
	

	@Override
	public void save(Project project) {
		String sql =  "Insert into projects(name, description, pid) values (?,?,?)";
		PreparedStatement pstmt = prepareStatement(sql);
		try {
			pstmt.setString(1, project.getName());
			pstmt.setString(2, project.getDescription());
			pstmt.setString(3, project.getPid());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closePrepareStatement();
		
	}

	@Override
	public List<Project> findAll() {
		String sql =  "Select * from projects";
		List<Project> projects = new ArrayList<>();
		PreparedStatement pstmt = prepareStatement(sql);
		try {
			//ResultSet rs = pstmt.executeQuery(sql);
			ResultSet rs=pstmt.executeQuery();
			while (rs.next()) {
				Project project=new Project();
				project.setId(rs.getInt("id"));
				project.setName(rs.getString("name"));
				project.setDescription(rs.getString("description"));
				project.setPid(rs.getString("pid"));
				projects.add(project);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return projects;
	}

	@Override
	public void update(Project project) {
		// Main Logic for Update
		
	}

	@Override
	public void delete(int id) {
		// Main Logic for Delete
		String sql = "delete from projects where id=?";
		PreparedStatement pstmt = prepareStatement(sql);
		try {
			pstmt.setInt(1,id);
			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
