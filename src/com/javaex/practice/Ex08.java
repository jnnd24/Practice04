package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		int[] lott = new int[6];
		
		for(int i = 0; i<6; i++) {
			lott[i] = (int)(Math.random()*45+1);
			for(int j = 0; j<i; j++) {
				while(lott[i]==lott[j]) {
					lott[i] = (int)(Math.random()*45+1);
					
				}
			}
			System.out.print(lott[i] + "\t");
		}
		
	}

}
