
public class Student2 {
	//メンバ変数（属性）
	String name;
	int engScore;
	int mathScore;
	
	// オーバーロード
	void setData(String n) {
		name = n;
	}
	
	void setData(String n, int e, int m) {
		name = n;
		engScore = e;
		mathScore = m;
	}
	
	//メソッド（操作）　クラス定義の直下に書く
	void display() {
		System.out.println(name + "さん");
		System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
	}
	
	void setScore(int eng, int math) {
		engScore = eng;
		mathScore = math;
	}
	
	double getAvg() {
		double avg = (engScore + mathScore) / 2.0;
		return avg;
	}
	
	
}
