import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateStringInArray {

	public static void main(String[] args) {
		String[] names = { "Rohan", "Amit", "Digvijay","Rohan" };
		//Approach 1
		duplicateString(names);
		//Approach 2
		
		HashSet<String> names2 = new HashSet<String>();
		boolean flag2 = true;
	    for(String n : names) {
	    	 boolean s =names2.add(n);
	    	if(s == false) {
	    		System.out.println("Duplicate string found in HashSet is:"+n);
	    		flag2 = false;
	    }
	}
	    if(flag2) {
	    	System.out.println("No duplicate string found");
	    }
	}
	public static void duplicateString(String[] names) {
		boolean flag = false;
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i] == names[j]) {
					System.out.println("Duplicate string is:"+names[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("No duplicate string");
		}
	}

	
			
}
