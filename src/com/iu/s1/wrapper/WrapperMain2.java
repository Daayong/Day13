package com.iu.s1.wrapper;

import java.util.Scanner;

public class WrapperMain2 {

	public static void main(String[] args) {
		//주민번호 입력받기 
		//991224-1234567
		//몇살 
		//3-5 : 봄 
		//6-8 : 여름
		//9-11 :가을 
		//12-2 : 겨울
		
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("주민번호를 입력하세요");
	//	String num =sc.next();
		String num = "930826-1234567";
		
		String ageStr =num.substring(0, 2);
		String season = num.substring(2,4);
		 
		int age=Integer.parseInt(ageStr);
		int month=Integer.parseInt(season);
		
		age= 1900+age;
		 
		System.out.println("몇살인가?"); 
		System.out.println(2021-age);
		
		if(month>=3 && month<6) {
			System.out.println("봄 출생입니다.");
		}else if(month>=6 && month<9) {
			System.out.println("여름 출생입니다.");
		}else if(month>=9 && month<12) {
			System.out.println("가을 출생입니다.");
		}else {
			System.out.println("겨울 출생입니다.");
		}
		
	
		
		
	
	}
}
