

public  class DueDate implements Comparable<DueDate>{

	private int year;
	private int month;
	private int day;
		
	public DueDate(int month,int day,int year) {
		this.year=year;
		this.month=month;	
		this.day=day;
	}
	public static int getYear(int year) {
		return year;
	}
	public static int getMonth(int month) {
		return month;
	}
	public static int getDay(int day) {
		return day;
	}
	public  String toString() {
		return   month + "/" + day + "/" + year ;
	}	
	public int compareTo(DueDate other) {
		if(year!=other.year) {
			return year-other.year;
		}else if( month!=other.month) {
			return month-other.month;
		}else {
			return day-other.day;
		}
	}

}
