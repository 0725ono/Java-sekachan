package Chapter4;

public class Person3 {
	private String name;
	
	public Person3(String name) {
		this.name = name;
		// ここのthis.nameは4行目のnameをさしている。
	}
	
	public void display() {
		System.out.println("名前：" + name);
	}
 }

