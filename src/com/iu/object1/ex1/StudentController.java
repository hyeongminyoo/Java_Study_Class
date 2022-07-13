package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {
	
	//start 메서드 선언
	//
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		Student [] students = null;
		while(check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로그램 종료");
			int select = sc.nextInt();
			switch(select) {
				case 1:
					System.out.println("===학생 정보 입력===");
					students = ss.makeStudents();
					break;
				case 2:
					System.out.println("===학생 정보 조회===");
					sv.viewAll(students);
					break;
				case 3:
					System.out.println("===학생 정보 검색===");
					Student stu = ss.findStudent(students);
					if(stu == null) {
						String msg = "없는 학생입니다";
						sv.viewMessage(msg);
					}else {
						sv.viewOne(stu);
					}
					break;
				case 4:
					System.out.println("===학생 정보 삭제===");
					break;
				case 5:
					System.out.println("===학생 정보 추가===");
					break;
				default:
					System.out.println("===종료중===");
					check = !check;
					break;
				
			}
			
		}//while문 끝
		
	}

}
