package com.test.first.level7;

public class Unit {
	//final 사용시 메소드로 값 입력이아닌, 생성자로 값을 넣어줘야된다.
	//final 사용이되면, 무조건 값이 입력 되어야함
	public final String NAME;
	public final int MAX_HP;
	private int current_hp;
	
	public Unit(String name, int max_hp) {
		this.NAME = name;
		this.MAX_HP = max_hp;
		this.current_hp = max_hp;
	}
	public int getCurrent_hp() {
		return current_hp;
	}
	
	public void setCrrent_hp(int hp) {
		this.current_hp = hp;
	}
	
	public void move(int x, int y) {
		System.out.printf("x : %d, y : %d 좌표로 이동\n", x, y);
	}
	public void getDamage(int damage) {
		current_hp -= damage;
	}
	@Override
	public String toString() {
		return String.format("%s, 현재 HP : %d", NAME, current_hp);
		//toString 변환
		//format = printf
	}
}
