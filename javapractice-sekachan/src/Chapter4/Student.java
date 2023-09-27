package Chapter4;

public class Student extends Person {
	private int stuNo;
	
	public void setStuNo(int s) {
		stuNo = s;
	}
	
	// オーバーライドしている！
	// Personでは名前表示のみだったが、ここでは学籍番号の表示を追加している。
	public void display() {
		System.out.println("名前：" + getName());
		System.out.println("学籍番号：" + stuNo);
	}
}
