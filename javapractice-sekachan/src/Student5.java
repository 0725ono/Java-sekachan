
public class Student5 {
	//メンバ変数（属性）
	private String name;
	private int score;

	// ここにstatic!
	static int counter = 0;
	
	// コンストラクタ
	public Student5(String n) {
		name = n;
	}
	
	public void setScore(int s) {
		if (0 <= s && s <= 100) {
			score = s;
		} else {
			System.out.println(name + "さんの点数が範囲外です。");
		}
	}
	
	void display() {
		System.out.println(name + "さん：" + score + "点");
	}

}
