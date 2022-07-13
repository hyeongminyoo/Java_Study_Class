package com.iu.object3;

import java.util.Random;
import java.util.Scanner;

public class Object3Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReturnTest rt = new ReturnTest();
		
		rt.info();
		int num = rt.makeRandom();
		System.out.println(num);
		
		System.out.println("=================");
		
		System.out.println("숫자입력");
		int count = sc.nextInt();
		
		int [] nums = rt.makeRandom2(count);
		
		
		for(int i = 0; i<count; i++) {
		System.out.println(nums[i]);
		}
		
		System.out.println("====================");
		
		
		Account acc = rt.makeAccount();
		
		System.out.println(acc.title);
		System.out.println(acc.host);
		System.out.println(acc.numbers);
		System.out.println(acc.balance);
	}

}
