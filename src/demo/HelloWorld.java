package demo;
import java.util.Scanner;
 class HelloWorld {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to the number calculator");
		do {
			System.out.print("Enter the first number : ");
			float a = scn.nextFloat();
			System.out.print("Enter the second number : ");
			float b = scn.nextFloat();		
			scn.nextLine();
			System.out.println("Enter the operaton to perform : (+,-,*,/)");
			System.out.print("Option : ");
			String s = scn.nextLine();
			if(s.equals("+")) {
				float c = a+b;
				System.out.println("The Sum is : "+c);
			}
			else if(s.equals("-")) {
				float c = a-b;
				System.out.println("The Sub is : "+c);
			}
			else if(s.equals("*")) {
				float c = a*b;
				System.out.println("The Mul is : "+c);
			}
			else if(s.equals("/")) {
				if(b != 0) {
				float c = a/b;
				System.out.println("The Div is : "+c);
				}
				else {
					System.out.println("The demoninator should not be 0 by which we will get the udefined or infiite");
				}
			}
			else {
				System.out.println("You enterd Wrong Option");
			}
			
			System.out.println("Do u want to continue (Y/N)");
			System.out.print("Option : ");
			String op = scn.nextLine().strip().toUpperCase();
			if(!op.equals("Y")) {
				break;
			}
		}while(true);
        System.out.println("Thank you for using the calculator!");
        scn.close();
	}
}
 
 