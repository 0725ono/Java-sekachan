package polymosample2;

public class Drakee extends Ability {
	public Drakee(String name) {
		super(name);
	}
	
	public void attack() {
		System.out.println("ドラキーのこうげき！");
	}
	
	public void magic() {
		System.out.println("ドラキーはラリホーをとなえた！");
	}
	
	public void special() {
		System.out.println("ドラキーはぼーっとしている");
	}
}
