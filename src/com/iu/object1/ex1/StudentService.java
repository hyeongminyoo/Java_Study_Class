package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {
	
	Scanner sc;
	public StudentService() {
		sc = new Scanner(System.in);
	}
	
	//removeStudent
	//학생들의 정보를 받아서
	//삭제하려는 학생의 번호를 입력받음
	//학생의 번호와 일치하는 학생을 삭제
	//남은 학생들의 정보를 리턴
	
	public Student [] removeStudent(Student[] students) {
		Student[] studentCopy = new Student[students.length-1];
		System.out.println("번호를 입력");
		int num = sc.nextInt();
		
		int i = 0;
		for(i = 0; i<students.length ; i++) {
			if(num==students[i].getNum()) {
				break;
			}
		}	
		int index = 0;
		for(int j = 0; j<students.length; j++ ) {
			 if(j==i) {
				 j++;
				 continue;
			 }
			studentCopy[index] = students[j];
			index++;
		}
			students = studentCopy;
			return students;
	}
	
	
	
	
	
	//addStudent
	//학생들의 정보를 받아서
	//학생 한명을 추가
	//학생 정보들을 리턴
	public Student [] addStudent(Student[] students) {
		Student[] studentscopy = new Student[students.length+1];
		Student stu = new Student();
		System.out.println("이름을 입력하세요");
		stu.setName(sc.next());
		System.out.println("번호 입력");
		stu.setNum(sc.nextInt());
		System.out.println("국어 입력");
		stu.setKor(sc.nextInt());
		System.out.println("영어 입력");
		stu.setEng(sc.nextInt());
		System.out.println("수학 입력");
		stu.setMath(sc.nextInt());
		
		stu.setTotal();
		
		int i = 0;
		for(i = 0; i<students.length; i++) {
			studentscopy[i] = students[i];
		}
		studentscopy[i] = stu;
		students = new Student[studentscopy.length];
		students = studentscopy;
		
		return students;
		
	}
	
	
	
	

	//findStudent
	//검색하고 싶은 학생의 번호를 입력받아서,
	//같은 번호의 학생을 찾아서 그 학생한명을 리턴
	//없으면 null을 리턴
	public Student findStudent(Student[] students) {
		Student stu = new Student();
		System.out.println("검색 학생 번호 입력");
		int num = sc.nextInt();
		//리턴하려는 학생
		stu = null;
		for(int i = 0; i<students.length ; i++) {
			if(num==students[i].getNum()) {
				stu = students[i];
				return stu;
				//break;
			}
		}
		return stu;
	}
	
	
	
	//makeStudents
	//학생 수를 입력받고
	//학생 수 만큼 정보를 입력받고 ( 이름, 번호 , 국영수, 총 ,평 )
	//학생들을 리턴
	public Student[] makeStudents() {
		System.out.println("학생수 입력");
		int count = sc.nextInt();
		Student [] students = new Student[count];
		
		for(int i = 0; i<count; i++ ) {
			Student stu = new Student();
			System.out.println("이름을 입력하세요");
			stu.setName(sc.next());
			System.out.println("번호 입력");
			stu.setNum(sc.nextInt());
			System.out.println("국어 입력");
			stu.setKor(sc.nextInt());
			System.out.println("영어 입력");
			stu.setEng(sc.nextInt());
			System.out.println("수학 입력");
			stu.setMath(sc.nextInt());
			
			stu.setTotal();

			students[i] = stu;
		}
		
			return students;
		
		
	}
	
}
