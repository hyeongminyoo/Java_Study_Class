package com.iu.object2;

public class Object2Main4 {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.name = "iu";
		member.age = 30;
		member.email = "iu@naver.com";
		
		Member member2 = new Member();
		member2.name = "b";
		member2.age = 20;
		member2.email = "b@naver.com";
		
		Member member3 = new Member();
		member3.name = "c";
		member3.age = 10;
		member3.email = "c@naver.com";
		
		Member [] array = new Member[3];
		array[0] = member;
		array[1] = member2;
		array[2] = member3;
		
		Method4 m4 = new Method4();
		m4.info(array);
		
		System.out.println(array.length);//3
		
	}

}
