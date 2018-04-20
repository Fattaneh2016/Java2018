
public class DepartmentClient {

	public static void main(String[] args) {
		Department d1=new Department();
		Department d2=new Department();
		d1.setName("Computer Science");
		d1.setNoOfStudents(1080);
		d2.setName("Electrical engineer");
		d2.setNoOfStudents(d1.getNoOfStudents()-80);
		
		System.out.println(d1.getName());
		System.out.println(d1.getNoOfStudents());
		
		System.out.println(d2.getName());
		System.out.println(d2.getNoOfStudents());
		
	}

}
