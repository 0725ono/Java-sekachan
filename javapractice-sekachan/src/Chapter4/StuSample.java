package Chapter4;

public class StuSample {

	public static void main(String[] args) {
		Student stu = new Student();
		
		// スーパークラスのメソッド
		stu.setName("菅原");
		stu.display();
		
		// サブクラスのメソッド
		stu.setStuNo(1);
		// ここではPersonを継承したStudentクラスのインスタンス化を行い、オーバーライドされているメソッドを実行
		// ここでは当然、スーパークラスのdisplayではなくサブクラスのdisplayが実行されることに注意
		stu.display();
	}

}
