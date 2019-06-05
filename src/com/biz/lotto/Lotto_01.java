package com.biz.lotto;

import java.util.Random;

public class Lotto_01 {

	public static void main(String[] args) {
			
		// 6개의 정수형 배열을 선언 및 초기화(생성)
		// 1부터 45까지의 임의의 정수를 1개씩 배열에 채우시오
		int i = 0;
		
		int[] num = new int[6];
		
		Random rnd = new Random();  //  Random 메소드 생성
		
		for(i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(45+1);  // 0~45까지 번호 생성
			
		}
		for(i = 0; i< num.length; i++) {
			System.out.print(num[i] + "\t"); // 배열에 생성된 6개의 숫자 출력
		}
		
		// 또 다른 임의의 숫자(1부터 45)를 하나 생성해서
		// num 배열에 담겨 있는지 검사
		// 있으면 있다
		// 없으면 없다라고 표시
		
		int intR = rnd.nextInt(45) + 1;
		int index;
		for (index = 0; index < num.length; index++ ) {
			if(num[index] == intR) {
				break;
			}
		}
		if(index >= num.length) {
			System.out.println("값이 없음 ");
		}else {
			System.out.println("값이 있음");
		}
		
		
	}

}
