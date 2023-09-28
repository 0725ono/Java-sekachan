package polymosample2;

public class PolymoSample2 {

	public static void main(String[] args) {
		Slime slime = new Slime("スライム");
		Drakee drakee = new Drakee("ドラキー");
		
		Monster mon1 = new Monster("スライム", slime);
		mon1.display();
		
		Monster mon2 = new Monster("ドラキー", drakee);
		mon2.display();
		
		mon1.showAbility();
	}

}
