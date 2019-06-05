package com.biz.arr;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		int[] intKor = new int[5];

		Random rnd = new Random();
		for (int i = 0; i < intKor.length; i++) {

			int intRnd = rnd.nextInt(50) + 51;
			intKor[i] = intRnd;
		}
		for (int i = 0; i < intKor.length; i++) {
			System.out.print(intKor[i]);
			if ((i + 1) % 5 == 0)
				System.out.println();
			else
				System.out.print(", ");

		}
		
		// 반복적으로 인접한 배열에 담긴 값과 비교하여 자리바꿈을 실행하면서
		// 작은 수부터 큰 수 순서로 나열하는 코드
		for (int leftI = 0; leftI < intKor.length; leftI++) {
			for (int rightI = leftI + 1; rightI < intKor.length; rightI++) {
				if (intKor[leftI] > intKor[rightI]) {

					int _temp = intKor[leftI];
					intKor[leftI] = intKor[rightI];
					intKor[rightI] = _temp;
				}
			}
		}

		for (int i = 0; i < intKor.length; i++) {
			System.out.print(intKor[i]);
			if ((i + 1) % 5 == 0)
				System.out.println();
			else
				System.out.print(", ");

		}

	}

}
