package poly.noinheri;

public class Warrior {
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;

	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}

	public void showStatus() {
		System.out.println("------------------------");
		System.out.println("아이디 : " + id);
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + atk);
		System.out.println("방어력 : " + def);
		System.out.println("경험치 : " + exp);
		System.out.println("------------------------");
	}

	public void huntRabbit(Rabbit rabbit) {
		if (rabbit.getHp() <= 0) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			return;
		}
		rabbit.setHp(rabbit.getHp() - atk);
		if (rabbit.getHp() <= 0) {
			System.out.println("토끼를 사냥했습니다.");
			exp += 5;
		} else {
			System.out.println("토끼를 공격했습니다.");
		}
	}

	public void huntRat(Rat rat) {
		if (!rat.isRatActive()) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			return;
		}
		rat.setDamagedHp(atk);
		if (!rat.isAttackedRatAtive(atk)) {
			System.out.println("쥐를 사냥했습니다.");
			exp += 80;
		}else {
			System.out.println("쥐를 공격했습니다.");
			System.out.println("쥐가 죽지않아 반격합니다.");
			hp -= rat.getAtk();
		}
	}
	
	public void huntPog(Pig pig) {
		if (!pig.isActive()) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			return;
		}
		
		if (!pig.isActive()) {
			System.out.println("돼지를 사냥했습니다.");
			exp += 80;
		}else {
			System.out.println("돼지를 공격했습니다.");
			System.out.println("돼지가 죽지않아 반격합니다.");
			hp -= (pig.getAtk() - def);
		}
	}
	
	public void huntGhost(Ghost ghost) {
		if (!ghost.isActive()) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			return;
		}
		
		if (!ghost.isActive()) {
			System.out.println("귀신을 사냥했습니다.");
			exp += 80;
		}else {
			System.out.println("귀신을 공격했습니다.");
			System.out.println("귀신이 죽지않아 반격합니다.");
			hp -= (ghost.getAtk() - def);
		}
	}

}
