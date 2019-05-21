package intro;

import java.util.Scanner;

public class sumnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Keyboard = new Scanner(System.in);
		  System.out.println("enter a number");
		  int number =Keyboard.nextInt();
		int total=0;
		
		for (int i=0;i<=number;i++){
			total=total+i;
		}
		
			System.out.println("the total is"+total);
		
		

	}

}
