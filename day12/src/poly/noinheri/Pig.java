package poly.noinheri;


public class Pig {
	private int hp;
	private int atk;
	private int def;
	
	public Pig() {
		hp = 10;
		atk = 7;
		def = 5;
	}
	
	public boolean isActive() {
		return hp > 0 ? true : false;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
}
