package thissuperpractice;

public class Person {
	String name;
	
	Person(String name) {
		this.name = name;
	}
	
	void introduce() {
		System.out.println(this.name + "です！");
	}
	
	public class Main {
		public static void main(String[] args) {
			Person p1 = new Person("ごま");
			p1.introduce();
			
			Person p2 = new Person("ぽん");
			p2.introduce();
		}
	}

}
