package com.javaex.practice;

public class Ex08미완 {

	public static void main(String[] args) {

		int[] lott = new int[6];
		
		for(int i = 0; i<6; i++) {
			lott[i] = (int)(Math.random()*45+1);
			for(int j = 0; j<6; j++) {
				if(lott[i]==lott[j]) {
					lott[i] = (int)(Math.random()*45+1);
					continue;
				}
			}
			System.out.print(lott[i] + "\t");
		}
		
	}

}
