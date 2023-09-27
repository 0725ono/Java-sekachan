package Chapter4;

public class StuSample3 {

	public static void main(String[] args) {
		Student3 stu = new Student3("菅原");
		stu.display();
		// まずサブクラスのdisplay()が呼び出され、その中のsuper.display()でスーパークラスの処理が呼び出され、名前の出力がされる。
	}

}
