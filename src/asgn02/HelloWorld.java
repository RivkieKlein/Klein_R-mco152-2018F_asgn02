package asgn02;
import java.util.Scanner;
public class HelloWorld {
	public static void main(String []args) {
	Scanner keyboard = new Scanner(System.in);
	char cont;
	
	do {
	//get user input	
	System.out.println("Enter 2 numbers separated by a space");
	int num1 =keyboard.nextInt();
	int num2 = keyboard.nextInt();
	keyboard.nextLine();
	
	//calculator object
	Calculator calc = new Calculator(num1, num2);
	
	//user choosed action
	System.out.println("Would you like to add or subtract these 2 numbers? a or s");
	char choice = keyboard.nextLine().toUpperCase().charAt(0);
	
	if(choice=='A') {
	System.out.println( calc.getnum1()+" + "+calc.getnum2()+ " = "+calc.add());
	}
	
	else if(choice =='S') {
	System.out.println( calc.getnum1()+" - "+calc.getnum2()+ " = "+calc.subtract());
	}
	
	System.out.println("Would you like to continue adding and subtracting?y or n");
	cont = keyboard.nextLine().toUpperCase().charAt(0);
	
	}while(cont != 'N');
	}

}
