package com.iu.object4;

public class Object4Main1 {

	public static void main(String[] args) {
		Resume re = new Resume(); //Resume() : 생성자, 생성자는 객체 생성시에만 사용하고 그 후 사용 불가
		Car car1 = new Car();
		//car1.brand = "토레스";
		car1.info();
		
		Car car2 = new Car("Black","소나타");
		car2.info();
	}

}
