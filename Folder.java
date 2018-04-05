
public class Folder implements Comparable<Folder>{

	private String name;
	private int numberOfFiles;
		
	public Folder(String name,int number) {
		name=name;
		numberOfFiles=number;
	}	
	public String getName() {		
		return name;				
	}
	
	public int getNumberOfFiles() {		
		return numberOfFiles;
	}
	
	public int compareTo(Folder other) {
		
		if(name.equals(other.name)) {
			return numberOfFiles;
		}else {
			return name.compareTo(other.name);
		}				
	}
}
