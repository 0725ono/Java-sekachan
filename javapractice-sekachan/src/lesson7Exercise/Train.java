package lesson7Exercise;

public class Train extends Vehicle{
	
	public Train(int crewNum) {
		super(crewNum);
	}
	
	public void showCrewNum() {
		System.out.println("電車の乗客：" + crewNum + "名");
	}
}
