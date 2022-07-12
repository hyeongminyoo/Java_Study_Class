package com.iu.object2;

import java.util.Scanner;

public class Object2Main3 {

	public static void main(String[] args) {
		Method3 m3 = new Method3();
		//월급입력
		int salary = 5000000;
		//salary는 인자값
		m3.sal(salary);
		System.out.println(salary);
		
		//hap(10, 20);
		
		m3.info("b",30, "iu@gmail.com");
		
		Member member = new Member();
		member.name = "a";
		member.age = 30;
		member.email = "asdf@asdf.com";
		
		m3.info2(member);
		System.out.println(member.age);
	}

}
