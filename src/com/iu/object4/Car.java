package com.iu.object4;

public class Car {

	String company = "쌍용";
	String brand;
	String color;
	boolean gear; //true : 오토 , false : 수동
	
	//Instance 블럭 {}
	{
//		this.company = "기아";
//		this.brand = "k5";
//		this.color = "Black";
//		this.gear = false;
	}
	
	public Car() {
		this("white"); //자기자신의 또다른 생성자 호출
//		this.company = "현대";
//		this.brand = "아반떼";
//		this.color = "White";
//		this.gear = true;
	}
	
	public Car(String color) {
//		System.out.println(); //this() 생성자 영역 내에서 첫줄에 위치해야함
		
//		this.company = "현대";
//		this.brand = "아반떼";
//		this.color = color;
//		this.gear = true;
		this(color,"아반떼");
	}
	
	
	public Car(String color, String brand) {
		this.company = "현대";
		this.brand = brand;
		this.color = color;
		this.gear = true;
	}
	
	public void info() {
		System.out.println("company : " + this.company);
		System.out.println("brand : " + this.brand);
		System.out.println("color : " + this.color);
		System.out.println("gear : " + this.gear);
	}
	
}
