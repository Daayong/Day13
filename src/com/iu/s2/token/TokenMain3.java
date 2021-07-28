package com.iu.s2.token;

import java.util.StringTokenizer;

public class TokenMain3 {

	public static void main(String [] args) {
		String str1="korea-usa-france"; //split
		String [] s = str1.split("-");
		Nation [] nations = new Nation[s.length];
		for(int i=0; i<s.length; i++) {
			Nation n = new Nation();
			n.setName(s[i]);
			nations[i]=n;
		}
		
		StringTokenizer st = new StringTokenizer(str1, "-");
		
		int i=0;
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			Nation n = new Nation();
			n.setName(name);
			nations[i]=n;
			i++;
		}
		
	
		
		String str2 = "note10-100-iphone12-130-zflip-300"; //Tokenizer
		
		//split
		String [] strs = str2.split("-");

		for(int i=0; i<strs.length; i++) {
			Phone phone = new Phone();
			phone.setName(strs[i]);
			phone.setName(strs[++i]);
			
		}
		
		StringTokenizer st2= new StringTokenizer(str2,"-");
		while(st2.hasMoreTokens()) {
			Phone phone = new Phone();
			phone.setName(st.nextToken());
			phone.setPrice(st.nextToken());
			
		}
		
		
		
		
	}
	
}
