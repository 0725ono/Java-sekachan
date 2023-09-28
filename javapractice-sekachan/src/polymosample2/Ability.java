package polymosample2;

public abstract class Ability {
	private String name;
	
	public Ability(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println(name + "があらわれた！");
	}
	
	public abstract void attack();
	
	public abstract void magic();
	
	public abstract void special();
}
