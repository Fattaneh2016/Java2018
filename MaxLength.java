import java.util.ArrayList;
public class MaxLength {

	public static void main(String[] args) {

		ArrayList<String> list =new ArrayList<String>();
		list.add("a");
		list.add("bb");
		list.add("ccc");
		list.add("ddddd");
		System.out.println(list.toString());
		System.out.println(maxLength(list));
	}
	
	public static int maxLength(ArrayList<String> list) {
		if(list.size()==0) {
			return 0;
		}
		int max=0;
		int length=0;
		for(int i=0 ;i<list.size();i++) {
			if(list.get(i).length()>list.get(max).length() ) {
				max=i;
				length=list.get(max).length();	
				list.remove(max);
			}			
		}
		return length;
	}
}
