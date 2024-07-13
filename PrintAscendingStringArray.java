public class PrintAscendingStringArray {

	public static void main(String[] args) {
		String[] names = {"Rohan","Aman","Rohit","Swaraj"};
		
		for(int i=0; i<names.length-1; i++) {
			for(int j=0; j<names.length-1-i; j++) {
				if(names[j].compareTo(names[j+1]) > 0){
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] =temp;
					
				}
		}
	}
		for(String s : names) {
			System.out.println(s);
		}

	}
}
