package com.iu.object1.ex1;

public class Student {
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	// 멤버변수는 힙 , 지역변수는 스택 메모리영역 차지
	public void setTotal() {
		this.total = this.kor + this.eng + this.math;
		this.setAvg();
	}
	
	public void setAvg() {
		this.avg = this.total / 3.0 ;
	}

}
	