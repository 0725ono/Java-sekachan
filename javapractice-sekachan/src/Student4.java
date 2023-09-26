
public class Student4 {
	//メンバ変数（属性）
	String name;
	
	// ここにstatic!
	static int counter = 0;
	
	// コンストラクタ
	Student4(String n) {
		name = n;
		counter++;
		System.out.println(name + "さんをインスタンス化しました");
	}
	
	// ここをstatic!
	static void display() {
		System.out.println(counter + "人です");
	}
	
	
}
