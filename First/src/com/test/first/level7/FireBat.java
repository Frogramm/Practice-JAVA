package com.test.first.level7;
public class FireBat extends Unit implements AttackUnit{

	private int damage;
	
	
	public FireBat() {
		super("파이어뱃", 60);
		damage = 7;
	}
	
	@Override //오버라이딩 강제성이 있다.
	public void attack(Unit u) {
		if(u == this) {return;}
		System.out.println("화아앙아");
		u.getDamage(damage);
	}
}
