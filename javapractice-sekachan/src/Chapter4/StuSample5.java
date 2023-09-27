package Chapter4;

public class StuSample5 {

	public static void main(String[] args) {
		Student5 stu1 = new Student5("菅原", 1);
		
		// サブクラスの型をスーパークラスの入れ物の中に放り込んだ！
		Person5 psn = stu1;
		
		psn.display();
		
		// psn.chgStuNo(1001); // これはエラーになる。
		
		if(psn instanceof Student5) {
			Student5 stu2 = (Student5)psn;
			stu2.chgStuNo(1001);
			stu2.display();
		}
	}

}
