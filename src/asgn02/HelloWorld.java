package asgn02;
import java.util.Scanner;
public class HelloWorld {
	public static void main(String []args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter 2 numbers separated by a space");
	int num1 =keyboard.nextInt();
	int num2 = keyboard.nextInt();
	
	Adder adder = new Adder(num1, num2);
	Subtractor subber = new Subtractor(num1, num2);
	
	System.out.println( adder.getnum1()+" + "+adder.getnum2()+ " = "+adder.add());
	System.out.println( subber.getnum1()+" - "+subber.getnum2()+ " = "+subber.subtract());
	keyboard.close();
	}

}
