package thissuperpractice;

public class Animal {
	void makeSound() {
		System.out.println("動物の音");
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog d1 = new Dog();
		d1.makeSound();
	}

}

class Dog extends Animal {
	void makeSound() {
		super.makeSound();
		System.out.println("わんわん");
	}
}