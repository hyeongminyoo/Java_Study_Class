package com.iu.object1.ex1;

public class StudentView {
	
	//viewMessage
	//문자열을 받아서 그 문자열을 출력
	public void viewMessage(String msg) {

		System.out.println(msg);
	}
	
	//viewOne
	//학생 한명의 정보를 받아서 모든 정보를 출력
	
	public void viewOne(Student stu) {
		
			System.out.println("---------------------------------------------------------------------");
			System.out.println(stu.name);
			System.out.println(stu.num);
			System.out.println(stu.kor);
			System.out.println(stu.eng);
			System.out.println(stu.math);
			System.out.println(stu.total);
			System.out.println(stu.avg);
			System.out.println("---------------------------------------------------------------------");
	}
	
	
	//viewAll
	//학생들의 정보를 받아서 출력
	
	public void viewAll(Student [] students) {
		
		for(int i=0; i<students.length; i++) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("이름 : " + students[i].name + "\t" + "번호 : " + students[i].num );
			System.out.println("국어 : "+ students[i].kor + "\t" + " 영어 : "+ students[i].eng+ " 수학 : "+students[i].math );
			System.out.println("총점 : "+students[i].total+ "\t" +"평균 : "+ students[i].avg);
			System.out.println("---------------------------------------------------------------------");
		}

	}

}
