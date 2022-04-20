package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		double sum = 0;
		double ave = 0;
		
		double[] num = new double[5];
		for(int i = 0; i<num.length; i++) {
			num[i] = sc.nextDouble();
		}
		/* num[i]가 제대로 입력되었는지 검토
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		*/
		
		
		for(int i = 0; i<num.length; i++) {
			sum = sum+num[i];
		}
		
		ave = sum/5;
		// sum 값 검산 System.out.println(sum);
		System.out.println("평균은 " + ave + "입니다");
		
		sc.close();
		
	}

}
