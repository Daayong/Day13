package com.iu.s1.wrapper;

import java.util.*;

public class WrapperMain3 {
	public static void main(String [] args) {
	//9  9  1  2  2  4  - 1  2  3  4  5  6  * : 7은 검증번호
	// * 2  3  4  5  6  7    8  9  2  3  4  5
	//   18+ 27+ 4 +10+ 12+ 28+  8+ 18+ 6 +12+ 20+ 30 = 193(a)
	
	//2. a를 11로 나누어서 나머지를 구하기 
	//3. 11에서 나머지(1) 를  빼기 
	//3-1 . 나머지를 뺐을 때 두자리 이상이라면 
	//3-2 . 3번에서 나온 결과를 다시 10으로 나워서 그 나머지를 구하기 
	//4. 3번의 값이랑 검증번호랑 같으면 제대로 된 주민번호  
	String jumin="930826-2173717";
	
	
	String last = jumin.substring(13,14);
	int lastNum=Integer.parseInt(last);
	
	jumin=jumin.replace("-", "");
	
	String [] ju = jumin.split("");
	 
	int sum=0;
	int j=2;

	for(int i=0; i<ju.length-1; i++) {
		int num = Integer.parseInt(ju[i]);
		sum=sum + num*j;
		j++;
		if(j>9) {
			j=2;
		}
	}
	System.out.println(sum);
	
	int n = sum%11;
	System.out.println(n);
	
	if(n>9) {
		n= n%10;
	}
	
	n= 11-n;
	System.out.println(n);
	
	if(n==lastNum) {
		System.out.println("맞는 주민번호입니다.");
	}else {
		System.out.println("위조된 주민번호입니다.");
	}
	
	}
}
