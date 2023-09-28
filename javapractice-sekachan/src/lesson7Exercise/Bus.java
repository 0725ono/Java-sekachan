package lesson7Exercise;

public class Bus extends Vehicle implements Stopable {
	public Bus(int crewNum) {
		super(crewNum);
	}
	
	public void showCrewNum() {
		System.out.println("バスの乗客：" + crewNum + "名");
	}
	
	public void stop() {
		System.out.println("次、止まります。");
	}
}
