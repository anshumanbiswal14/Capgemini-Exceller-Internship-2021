package lab9case;

public class Department {
	private int departmentId;
	private String departmentName;
	private int managerId;

	public Department(int departmentId, String departmentName, int managerId) {
		// TODO Auto-generated constructor stub
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;

	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
}
