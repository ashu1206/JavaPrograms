package strings;

public class FrequencyOfChar {

	public static void main(String[] args) {

		String str = "Welcome to Javatpoint portal tester";
		
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='t') {
				
				count++;
			}
		}
		
		System.out.println("Frequency of t is "+count);
	}

}
