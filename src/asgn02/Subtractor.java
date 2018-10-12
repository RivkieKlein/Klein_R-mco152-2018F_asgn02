package asgn02;

public class Subtractor {
	private int num1;
	private int num2;
	
	public Subtractor(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
				
	}
	
	public int subtract() {
		return(num1-num2);
	}
	
	public int getnum1() {
		return num1;
	}
	
	public int getnum2() {
		return num2;
	}
}
