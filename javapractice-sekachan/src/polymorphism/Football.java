package polymorphism;

public class Football extends Club {
	public Football(String name) {
		super(name);
	}
	
	public void practice() {
		System.out.println("サッカー部の練習1");
		System.out.println("サッカー部の練習2");
		System.out.println("サッカー部の練習3");
	}
}
