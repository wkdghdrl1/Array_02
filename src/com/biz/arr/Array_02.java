package com.biz.arr;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {
		
		int[] intKor = new int[100];
		Random rnd = new Random();
		for(int i = 0 ; i < intKor.length; i++) {
			intKor[i] = rnd.nextInt(50) + 51;
		}
		
		//향상된 for, forEach라고 부름		
		//아래 주석 코드를 간소화
		for(int n : intKor) {
			System.out.println(n + "\t");
		}

//		
//		for(int i = 0 ; i < intKor.length; i++) {
//			int n = intKor[i];
//			System.out.println(n + "\t");
//		}
		
		//intKor의 총점 구하기
		int intSum = 0;
		for(int n : intKor) {
			intSum += n;
		}
		System.out.println("총점: " + intSum);
	}

}
