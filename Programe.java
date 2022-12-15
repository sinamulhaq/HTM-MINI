package org.fi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class Programe {

	public static void main(String[] args) {
		ArrayList<String> arrayList =new ArrayList<>();
		 arrayList.add("Grape");
		 arrayList.add("waterMelon");
		 arrayList.add("Banana");
		 arrayList.add("Apple");
		 
		 System.out.println("Unsorted List");
		 for(String data:arrayList)
			 System.out.println("*********");
		 
		 Collections.sort(arrayList);
		 System.out.println("Sorted List");
		 for(String data:arrayList)
			 System.out.println(data);
	}
}
