package asgn02;
import java.util.Scanner;
public class HelloWorld {
	public static void main(String []args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter 2 numbers separated by a space");
	
	
	Adder adder = new Adder(keyboard.nextInt(), keyboard.nextInt());
	
	System.out.println( adder.getnum1()+" + "+adder.getnum2()+ " = "+adder.add());
	
	keyboard.close();
	}

}
