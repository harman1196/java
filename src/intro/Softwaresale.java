package intro;

import java.util.Scanner;

public class Softwaresale {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner Keyboard = new Scanner(System.in);
  System.out.println("how many sof u wnt to purchase");
  int numSoftware =Keyboard.nextInt();
  double discount=0;
  if(numSoftware >=10 &&numSoftware<=19){
	  discount=0.20;
  }
  else if (numSoftware>=20 &&numSoftware<=49){
	  discount=0.30;
  }
  else if (numSoftware>=50 &&numSoftware<=99){
	  discount=0.40;
  }
  else if (numSoftware>=100){
	  discount=0.50;
  }
  double subtotal =99*numSoftware;
  double discountAmount=subtotal*discount;
  double finalAmount=subtotal-discountAmount;
  
  System.out.println("subtotal:$"+subtotal);
  System.out.println("discount percent:$"+discount*100+"%");
  System.out.println("discountAmount:$"+discountAmount);
  
  System.out.println("finalAmount:$"+finalAmount);
  //System.out.printf("finalAmount:$%.2f",finalAmount);
  
  
  //rounded to 2 decimal points
  System.out.printf("final price:%.2f",finalAmount);
  
  
  
  
  
  // string formatting
  
	}

}
