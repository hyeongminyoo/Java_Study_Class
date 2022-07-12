package com.iu.object1;

public class ObjectMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//Object 생성
		//클래스명 변수명 = new 클래스명();
		//데이터타입 변수명
		Monster monster = new Monster();
		System.out.println(monster); //주소값
		//멤버변수 접근
		//변수명.멤버변수
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		monster.name = "오크";
		monster.hp = 100;
		monster.level = 5;
		
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		//----------------------------------------------
		
		Monster monster2 = new Monster();
		monster2.name = "오크";
		monster2.level = 5;
		monster2.hp = 100;
		
		System.out.println(monster == monster2); //주소가 다르므로 false
		
		
		Weapon sword = new Weapon();
		sword.name = "단검";
		sword.damage = 10;
		sword.inchant = 1;
		
		monster.weapon = sword;
		
		
		// monster : reference, 지역변수 , 참조변수
		// weapon : reference, 인스턴스변수, 
		System.out.println(monster.weapon.name); 
		
		System.out.println(monster2.weapon.name); 
		
		
		System.out.println("프로그램 종료");

	}

}
