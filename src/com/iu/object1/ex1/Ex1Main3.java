package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main3 {

	public static void main(String[] args) {
		// sc : reference / 지역변수 / 참조변수
			
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		
		for(int i = 0; i<students.length; i++) {
			Student st = new Student();
			students[i] = st;
			System.out.println("이름 입력");
			//students[i].name = sc.next();
			st.setName(sc.next());
		}

	}

}
