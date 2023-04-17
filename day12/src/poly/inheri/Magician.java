package poly.inheri;

public class Magician {
	final static int ALREADY_DEAD_MESSAGE_CODE = 1;
	final static int DEAD_MESSAGE_CODE = 2;
	final static int COUNTERATTACK_MESSAGE_CODE = 3;
	final static int FIREBALL_ATTACK_DAMAGE = 2;
	
	
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;

	public Magician(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 2;
		this.def = 0;
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

	public void hunt(Monster monster) {
		if (monster.isInactive()) {
			showSystemMessage(ALREADY_DEAD_MESSAGE_CODE  , monster.getName());
			return;
		}
		monster.isAttackeMonster(atk);
		if (monster.isAttackedInactive()) {
			showSystemMessage(DEAD_MESSAGE_CODE  , monster.getName());
			exp += monster.getExp();
		} else {
			showSystemMessage(COUNTERATTACK_MESSAGE_CODE  , monster.getName());
			hp = monster.showCounterAtk(def, hp);
		}
	}

	public void castFireball(Monster monster) {
		if (monster.isInactive()) {
			showSystemMessage(ALREADY_DEAD_MESSAGE_CODE  , monster.getName());
			return;
		}
		
		monster.isAttackeMonster(atk * FIREBALL_ATTACK_DAMAGE);
		
		if (monster.isAttackedInactive()) {
			showSystemMessage(DEAD_MESSAGE_CODE  , monster.getName());
			exp += monster.getExp();
		} else {
			showSystemMessage(COUNTERATTACK_MESSAGE_CODE , monster.getName());
			hp = monster.showCounterAtk(def, hp);
		}
	}

	//시스템 메세지 출력 메서드
	public void showSystemMessage(int systemNum,String monsterName) {
		switch (systemNum) {
		case 1:
			System.out.println(monsterName + "이(가) 이미 죽은 상태입니다.");
			break;
		case 2:
			System.out.println(monsterName + "이(가) 죽었습니다.");
			break;
		case 3:
			System.out.println(monsterName + "을 공격했습니다.");
			System.out.println(monsterName + "이 반격합니다.");
			break;
		default:

		}
	}
}
