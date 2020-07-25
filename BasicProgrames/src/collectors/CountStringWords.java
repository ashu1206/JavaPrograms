package collectors;

import java.util.HashMap;

public class CountStringWords {

	public static void main(String[] args) {

		String str = "Practice for what you want to achieve as practice makes a man perfect and until unless you practice you cannot achieve your goal ";
		String split[] = str.split(" ");
		
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(int i = 0;i<split.length;i++) {
			if(hm.containsKey(split[i])) {
				int count = hm.get(split[i]);
				hm.put(split[i], count+1);
			}else {
				hm.put(split[i], 1);
				}
		}
		System.out.println(hm);
	}

}
