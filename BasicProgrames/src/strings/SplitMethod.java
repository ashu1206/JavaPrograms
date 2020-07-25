package strings;

public class SplitMethod {

	public static void main(String[] args) {

		String str = "Welcome to java point";
		
       String[] words = str.split(" ");
		
		for(String w : words) {
			System.out.println(w);
			
		}
		
		System.out.println(str.startsWith("We"));
		System.out.println(str.substring(2,18));
		
		char ch[] = str.toCharArray();
		System.out.println(ch.length);
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		String str2 = " hello string ";
		
		System.out.println(str2);
		System.out.println(str2.trim());
	}

}
