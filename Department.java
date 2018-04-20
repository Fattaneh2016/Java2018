
public class Department {
	private String name;
	private int noOfStudents;

	public Department(String initName ,int initNoOFStudents) {
		this.setName(initName);
		this.setNoOfStudents(initNoOFStudents);
	}
	public Department() {
			
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
}
