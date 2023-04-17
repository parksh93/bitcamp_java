package poly.noinheri;

public class Ghost {
	private int hp;
	private int atk;
	private int def;
	
	public Ghost() {
		hp = 20;
		atk = 8;
		def = 3;
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

	public boolean isActive() {
		return hp > 0 ? true : false;
	}
}
