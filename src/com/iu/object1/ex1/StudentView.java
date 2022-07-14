package com.iu.object1.ex1;

public class StudentView {
	
	//viewMessage
	//문자열을 받아서 그 문자열을 출력
	public void viewMessage(String msg) {

		System.out.println(msg);
	}
	
	//viewOne
	//학생 한명의 정보를 받아서 모든 정보를 출력
	
	public void view(Student stu) {
		
			System.out.println("---------------------------------------------------------------------");
			System.out.println(stu.getName());
			System.out.println(stu.getNum());
			System.out.println(stu.getKor());
			System.out.println(stu.getKor());
			System.out.println(stu.getMath());
			System.out.println(stu.getTotal());
			System.out.println(stu.getAvg());
			System.out.println("---------------------------------------------------------------------");
	}
	
	
	//viewAll
	//학생들의 정보를 받아서 출력
	
	public void view(Student [] students) {
		
		for(int i=0; i<students.length; i++) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("이름 : " + students[i].getName() + "\t" + "번호 : " + students[i].getNum() );
			System.out.println("국어 : "+ students[i].getKor() + "\t" + " 영어 : "+ students[i].getEng()+ " 수학 : "+students[i].getMath() );
			System.out.println("총점 : "+students[i].getTotal()+ "\t" +"평균 : "+ students[i].getAvg());
			System.out.println("---------------------------------------------------------------------");
		}

	}

}
