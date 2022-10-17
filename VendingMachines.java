package vendingMachines001;

import java.util.Scanner;

public class VendingMachines {

	private static double sum;
	Products[] products;
	public VendingMachines() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//c,d
       Products p1=new Products("snake",1000);
       Products p2=new Products("drill",2000);
       Products p3=new Products("gumbill",3000);
       Products p4=new Products("optus",4000);
       Products p5=new Products("lotus",5000);
       Cart c1=new Cart("card");
       Cart c2=new Cart("cash");
       Scanner sc=new Scanner(System.in);
       System.out.println("Please Enter the total number of vending machines");
       int n=sc.nextInt();
       double sum=0;
       String[] stringArray=new String[n];
       String payment="";
       System.out.println("Please enter if the type of paymentgateway is card");
       boolean bool=sc.nextBoolean();
       if(bool==true) {
    	   payment=c1.getPayment();
       }
       else {
    	   payment=c2.getPayment();
       }
       System.out.println("\n");
       for(int i=0;i<n;i++){
         System.out.println("Please Enter the type of vending machines:");
         stringArray[i]=sc.nextLine();
       }
         for(int j=0;j<stringArray.length;j++) {
         if(stringArray[j]==p1.getName()) {
        	  sum+=c1.paymentMethod(payment,p1.getPrice());    
         }
         else if(stringArray[j]==p2.getName()) {
       	  sum+=c1.paymentMethod(payment,p2.getPrice());    
        }
         else if(stringArray[j]==p3.getName()) {
       	 sum+=c1.paymentMethod(payment,p3.getPrice());    
        }
         else  if(stringArray[j]==p4.getName()) {
       	  sum+=c1.paymentMethod(payment,p4.getPrice());    
        }
         else if(stringArray[j]==p5.getName()) {
       	 sum+= c1.paymentMethod(payment,p5.getPrice());    
        }
       }
       System.out.println(sum);
       
	}

}