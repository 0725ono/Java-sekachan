package polymosample2;

public class Monster {
	private String name;
	private Ability ability;
	
	public Monster(String name, Ability ability) {
		this.name = name;
		this.ability = ability;
	}
	
	public void display() {
		System.out.println(name + "があらわれた！");
	}
	public void showAbility() {
		ability.attack();
		ability.magic();
		ability.special();
	}
	
}
