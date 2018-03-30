
public class StudentClass implements Comparable<StudentClass>{
	int id;
	String name;
	
	public StudentClass(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public int compareTo(StudentClass other) {
		
		if(id!=other.id) {
			return id-other.id;
		}else
			
		return name.compareTo(other.name);
		
	}
}


