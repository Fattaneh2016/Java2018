import java.util.ArrayList;


public class lab7Arraylist {


	public static void main(String[] args) {


		ArrayList<String> myDouble=createDoubleList();		
		System.out.println(myDouble);
		doubleList(myDouble);

		System.out.println();

		ArrayList<Integer> myMin=createMinToFront();
		System.out.println(myMin);		
		minToFront(myMin);

		System.out.println();

		ArrayList<Integer> list1=createList1();
		ArrayList<Integer> list2=createList2();


		System.out.println(list1);	
		System.out.println(list2);	
		ArrayList<Integer> newList= intersect(list1,list2);
		System.out.println(newList);
	}


	private static ArrayList<Integer> intersect(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {

		ArrayList<Integer> newList=new ArrayList<Integer>() ;

		for(int i=0 ;i<list1.size();i++){
			for(int j=0 ;j<list2.size();j++){
				if(list1.get(i)==list2.get(j)){
					newList.add(list1.get(i));
											
				}			
			}		

		}
		return newList;
	}



	private static ArrayList<Integer> createList1() {

		ArrayList<Integer> list1=new ArrayList<Integer>() ;

		list1.add(1);
		list1.add(4);
		list1.add(8);
		list1.add(9);
		list1.add(11);
		list1.add(15);
		list1.add(17);
		list1.add(28);
		list1.add(41);
		list1.add(59);

		return list1;
	}

	private static ArrayList<Integer> createList2() {

		ArrayList<Integer> list2=new ArrayList<Integer>() ;


		list2.add(4);
		list2.add(7);
		list2.add(11);
		list2.add(17);
		list2.add(19);
		list2.add(20);
		list2.add(23);
		list2.add(28);
		list2.add(37);
		list2.add(59);
		list2.add(81);


		return list2;
	}


	public static void minToFront(ArrayList<Integer> myMin) {

		int minNum = myMin.get(0);
		int minIndex = 0;

		for(int i = 1; i < myMin.size(); i++)
		{
			if(myMin.get(i) < minNum)
			{
				minNum = myMin.get(i);
				minIndex = i;
			}
		}				
		myMin.remove(minIndex);
		myMin.add(0, minNum);

		System.out.println(myMin);

	}


	public  static ArrayList<Integer> createMinToFront() {

		ArrayList<Integer> myList=new ArrayList<Integer>() ;

		myList.add(3);
		myList.add(14);
		myList.add(6);
		myList.add(1);
		myList.add(22);

		return myList;
	}

	public  static ArrayList<String> createDoubleList() {

		ArrayList<String> myList=new ArrayList<String>() ;

		myList.add("\"how\"");
		myList.add("\"are \"");
		myList.add("\"you?\"");

		return myList;
	}

	public static void doubleList(ArrayList<String> myDoubleList) {

		for(int i=0 ;i<myDoubleList.size();i++){

			String str=myDoubleList.get(i);
			myDoubleList.add(i, str);
			i++;
		}

		System.out.println(myDoubleList);


	}

}
