package lesson5Exercise;

public class DriveCar3 {

	public static void main(String[] args) {
		// Carクラスのオブジェクトc1を生成
		Car3 c1 = new Car3();
		// c1の速度を30に設定
		c1.run(30);
		// c1のナンバー、速度を表示
		c1.display();
		
		Car3 c2 = new Car3(2525);
		// c2.speed = 50; //privateのため直接はアクセスできない！
		c2.run(50);
		c2.display();
	}

}
