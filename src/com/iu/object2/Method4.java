package com.iu.object2;

public class Method4 {

	//info
	//멤버들의 정보를 출력하는 메서드
	
	public void info(Member [] array) {
		
		for(int i=0; i<array.length; i++) {
			
			System.out.println(array[i].name);
			System.out.println(array[i].age);
			System.out.println(array[i].email);
			
		}
		array = new Member[2];
		
	}
}
