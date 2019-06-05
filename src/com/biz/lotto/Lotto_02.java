package com.biz.lotto;

import java.util.Random;

public class Lotto_02 {

	public static void main(String[] args) {

		int[] num = new int[6];
		Random rnd = new Random();

		for (int i = 0; i < num.length; i++) {
			int intR = rnd.nextInt(45) + 1;
			int index;

			for (index = 0; index < num.length; index++) {
				if (num[index] == intR) {
					break;

				}

			}
			if (index >= num.length) {
				num[i] = intR;

			} else {
				i = i - 1;
			}

		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}

}
