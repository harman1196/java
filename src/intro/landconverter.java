package intro;

import java.util.Scanner;

public class landconverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("how many squarefeet?");
      Scanner keyboard =new Scanner(System.in);
      double squarefeet = keyboard.nextDouble();
      
      double acres =squarefeet/43560;
      System.out.println("number of acres: " + acres);
	}

}
