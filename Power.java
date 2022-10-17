package foundationquestions001;

import java.util.Scanner;

public class Power {

	public Power() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the base number:");
		  int base=sc.nextInt();
		  System.out.println("Enter the power number");
		  int power=sc.nextInt();
		  int sum=0;
		  if((power%5==0)){
			  sum+=((power*base)*(power-base));
		  }
		  sum+=(power*base)*base+base;
		  System.out.println(sum);
	}

	
}
