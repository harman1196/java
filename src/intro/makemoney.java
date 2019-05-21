package intro;

import java.util.Scanner;

public class makemoney {

	public static void main(String[] args) {
		

		Scanner Keyboard = new Scanner(System.in);
		  System.out.println("number of day u wanna to work");
		  int days =Keyboard.nextInt();
		double total=0;	
		for(int i =1;i<=days;i++){
			 
			  double salaryToday =Math.pow(2,i-1);
			  System.out.println("money on day:"+i + " : " + salaryToday);
			  total=total+salaryToday;
			  System.out.println("totalso far:$"+total);
		}
		
		System.out.println("\ntotalso dollars:$"+total);
		 
	}

}
