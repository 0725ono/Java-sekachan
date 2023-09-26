
public class StuSample2 {
	public static void main(String[] args) {
		
		Student2 stu1 = new Student2();
		Student2 stu2 = new Student2();
		
		stu1.setData("ごま");
		stu1.setScore(90, 80);
		stu1.display();
		
		// オーバーロードしたメソッドを使用
		stu2.setData("田中", 75, 100);
		stu2.display();
	}
	
}
