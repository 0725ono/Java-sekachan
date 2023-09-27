package lesson6Exercise;

public class Car2 {
	private int no;
	
	// コンストラクタに変わっており、メンバ変数と同じ引数。そのためthis.no = no;となる。
	public Car2(int no) {
		this.no = no;
	}
	
	public void display() {
		System.out.println("ナンバーは" + no + "です");
	}
}
