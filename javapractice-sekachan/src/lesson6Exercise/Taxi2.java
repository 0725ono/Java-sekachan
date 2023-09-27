package lesson6Exercise;

public class Taxi2 extends Car2 {
	private int price;
	
	
	// 下のコンストラクタを定義後ここを定義。
	public Taxi2(int no){
		// このthisはすなわち、Taxi2クラスのコンストラクタを指すため、下で定義したものになる。(=Taxi2(int no, int price))
		// なので、二番目の引数はすなわちpriceに0を初期化していることになる。
		this(no, 0);
	}
	
	// まず先にこの下を定義。
	// superは継承元のCar2に置き換わり、 Car2のコンストラクタのthis.no = no;が行われる。
	// その下でpriceの初期化だが、引数とメンバ変数が同じであるためthis.price(=メンバ変数)=引数とかく。
	public Taxi2(int no, int price) {
		super(no);
		this.price = price;
	}
	
	public void start() {
		price = 420;
	}
	
	public void run() {
		price+=80;
	}
	
	public void display() {
		super.display();
		System.out.println("料金は" + price + "円です。");
	}

}
