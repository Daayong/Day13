package com.iu.s2.token;

import java.util.*;

public class TokenMain2 {

	public static void main(String[] args) {
		String str="Korea-USA-China*France*Uk-Canada-Germany";
		//나라별로 파싱
		//모든 나라이름은 대문자로 출력 
		str=str.replace('*', '-');
		StringTokenizer st = new StringTokenizer(str,"-");
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			s=s.trim().toUpperCase();
			System.out.println(s);
	
			
		}
	
		
		
		
	}

}
