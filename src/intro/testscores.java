package intro;

import java.util.Scanner;

public class testscores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner Keyboard = new Scanner(System.in);
     System.out.println("enter test 1");
     double sc1=Keyboard.nextDouble();
     
     System.out.println("enter test 1");
     
     double sc2=Keyboard.nextDouble();
     
     
     System.out.println("enter test 1");
		
     double sc3=Keyboard.nextDouble();
     double avg=(sc1+sc2+sc3)/3 ;
     System.out.println(avg);
	}

}
