package Chapter4;

public class Student3 extends Person3 {
	private int stuNo;
	
	public Student3(String name) {
		this(name, 999);
		// ここのthisはStudent3に変わるイメージ
		// 下のStudent3を呼び出しているイメージStudent3(name, 999);
	}
	public Student3(String name, int stuNo) {
		super(name);
		// このsuperはスーパークラスのPerson3のthis.name = name;に処理を任せている。
		this.stuNo = stuNo;
	}
	public void display() {
		super.display();
		System.out.println("学籍番号：" + stuNo);
	}
	

}
