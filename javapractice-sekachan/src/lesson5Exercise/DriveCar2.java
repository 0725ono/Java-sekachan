package lesson5Exercise;

public class DriveCar2 {

	public static void main(String[] args) {
		// Carクラスのオブジェクトc1を生成
		Car2 c1 = new Car2();
		// c1の速度を30に設定
		c1.run(30);
		// c1のナンバー、速度を表示
		c1.display();
		
		Car2 c2 = new Car2(2525);
		c2.run(50);
		c2.display();
	}

}
