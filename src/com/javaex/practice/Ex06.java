package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {

		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};

		System.out.println(c); // 변경 전
		
		for(int i = 0; i<c.length; i++) { // c[i]를 하나씩 체크하면서, ' '이면 ','로 바꿔라
			if(c[i]==' ') {
				c[i] = ',';
			}
		}
		
		
		
		System.out.println(c); 
	}

}
