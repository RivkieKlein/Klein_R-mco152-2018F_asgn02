package asgn02;
import java.util.Scanner;
public class HelloWorld {
	public static void main(String []args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num1=keyboard.nextInt();
	
	System.out.println("Enter another number");
	int num2=keyboard.nextInt();
	
	System.out.println(num1+" +76 "+num2+" = "+(num1+num2));
	}

}
