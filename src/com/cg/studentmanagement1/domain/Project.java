package com.cg.studentmanagement1.domain;
/**
 * This Project will work as a data traveler object from layer to layer
 * @author panka
 *
 */
public class Project {

	/**
	 * id of the project
	 * PK
	 */
	private int id;
	/**
	 * Name of the project
	 */
	private String name;
	/**
	 * Short description of the project
	 */
	private String description;
	/**
	 * Project Identifier, Should not be more than 4 to 5 character long
	 */
	private String pid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", Student Name=" + name + ", Branch=" + description + ", Year=" + pid + "]";
	}
	
	
	
}
