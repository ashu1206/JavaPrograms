package strings;

public class RevrseString {
	
	public static void main(String args[]) {
		
		String str = "madam";
		String reverse = "";
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(str);
		System.out.println(buffer.reverse());
		
		
		
		
		//By iteration and finding palindrome or not
		char chars[] = str.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			
			reverse = reverse+str.charAt(i);
			
			System.out.print(chars[i]);
			
		}
		System.out.println();
    if(reverse.equals(str)) {
			
			System.out.println("Palindrome");
			
		}else {
			System.out.println("Not Palindrome");
		}
		
	}
}

