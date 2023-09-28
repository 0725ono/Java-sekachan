package polymosample2;

public class Slime extends Ability {
	public Slime(String name) {
		super(name);
	}
	
	public void attack() {
		System.out.println("スライムのこうげき！");
	}
	
	public void magic() {
		System.out.println("スライムはまほうをとなえられない！");
	}
	
	public void special() {
		System.out.println("スライムはぷるぷるしている");
	}
}
