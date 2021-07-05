package com.cg.studentmanagement1.util;

import java.util.List;
import java.util.Scanner;

import com.cg.studentmanagement1.domain.Project;
import com.cg.studentmanagement1.service.ProjectService;
import com.cg.studentmanagement1.serviceimpl.ProjectServiceImpl;

public class MenuUtil {
	
	private ProjectService projectService;
	
	public MenuUtil() {
		projectService=new ProjectServiceImpl();
	}
	
	public void start() {
		Scanner sc=new Scanner(System.in);
		int optionChoice;
		String continueChoice;
		do {
			showMenu();
			System.out.println("Enter Your Choice : ");
			optionChoice = sc.nextInt();
			switch (optionChoice) {
			case 1:
				Project project = getProjectInput(sc);				
				projectService.createProject(project);
				break;
			case 2:
				System.out.println("--------Students List-----------");
				List<Project> projects = projectService.listProjects();
				for (Project prj : projects) {
					System.out.println(prj);
				}
				break;
			case 3:
				System.out.println("Updating   Student Record ");
//				//Calling Function
//				Project project = getProjectInput(sc);				
//				projectService.createProject(project);
				break;
			case 4:
				System.out.println("Deleting   Student Record ");
				int input = getDeleteInput(sc);				
				projectService.removeProject(input);
				break;

			default:
				System.out.println("Wrong Choice");
				break;
			}
			System.out.println("Do you want to continue : (yes/no) : ");
			continueChoice = sc.next();
		}while(continueChoice.equals("yes"));
	}

	private int getDeleteInput(Scanner sc) {
		int input = 0;
		System.out.println("Enter Student id:");
		input = sc.nextInt();
		return input;
	}

	private Project getProjectInput(Scanner sc) {
		Project project = new Project();
		System.out.println("Enter Student Name");
		project.setName(sc.next());
		System.out.println("Enter Branch Name");
		project.setDescription(sc.next());
		System.out.println("Enter Year");
		project.setPid(sc.next());
		return project;
	}

	private void showMenu() {
		System.out.println("-------Student Database Management Menu--------");
		System.out.println("1. Create New Student");
		System.out.println("2. List All Students");
		System.out.println("3. Update Student Record");
		System.out.println("4. Delete Student Record");
	}

}
