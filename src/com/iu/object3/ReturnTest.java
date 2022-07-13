package com.iu.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
	
	//makeAccount
	// title, host, 통장번호, 잔액을 입력받아서 리턴
	public Account makeAccount() {
		Account acc = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("통장이름 입력");
		acc.title = sc.next();
		System.out.println("예금주 입력");
		acc.host = sc.next();
		System.out.println("통장번호 입력");
		acc.numbers = sc.next();
		System.out.println("잔액 입력");
		acc.balance = sc.nextLong();
		
		return acc;
		
	}
	
	
	
	//호출 시 숫자를 받아서 그 숫자만큼 랜덤한 수를 뽑아서 리턴
	public int [] makeRandom2(int count) {
		Random random = new Random();
		int [] nums = new int[count];
		for(int i = 0; i<count ; i++) {
	//		int num = random2.nextInt(50);
	//		nums[i] = num;
			nums[i] = random.nextInt(50);
		}
		return nums; 
		
	}
	
	
	public int makeRandom() {
		Random random = new Random();
		int num = random.nextInt(50);
		
		//return 리턴하려는 Data
		return num; // 리턴은 하나만 가능 , 리턴할 타입은 선언부의 타입과 동일해야함 ( 자동 형변환은 가능)
	}
	
	
	public void info() {
		System.out.println("실행 후 그냥 종료");
	}
}
