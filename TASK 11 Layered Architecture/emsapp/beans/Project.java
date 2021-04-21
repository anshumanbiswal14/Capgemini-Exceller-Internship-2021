package com.capg.emsapp.beans;

public class Project implements Comparable<Project> {
	
	private int pid;
	private String projectName;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public Project() {
		super();
		
	}
	
	public Project(int pid, String projectName) {
		super();
		this.pid = pid;
		this.projectName = projectName;
	}
	public int compareTo(Project o) {
		
		return this.pid - o.getPid();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pid;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (pid != other.pid)
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + "]";
	}
	
	
	
	
	
	
	

}
