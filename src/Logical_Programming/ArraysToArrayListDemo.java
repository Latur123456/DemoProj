package Logical_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysToArrayListDemo {

	public static void main(String[] args) {
		String[] stringarray= {"sun","mon","tue"};
	 
	List<String> daysList = Arrays.asList(stringarray);
     System.out.println(daysList);
	}

}
